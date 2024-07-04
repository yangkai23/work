package com.cps.dbdetails.cpsdetails.dao;

import com.cps.dbdetails.cpsdetails.dto.ArticleMetaData;
import com.cps.dbdetails.cpsdetails.dto.CPSProdEntity;
import com.cps.dbdetails.cpsdetails.dto.ChubObject;
import com.cps.dbdetails.cpsdetails.dto.DfReprepare;
import com.cps.dbdetails.cpsdetails.mapper.*;
import com.cps.dbdetails.cpsdetails.util.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CpsDbDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    CPSProdEntityMapper cpsprodmapper;
    @Autowired
    AMDMapper amdMapper;
    @Value(value = "${partition}")
    int partition;
    @Value(value = "${inputFile}")
    String inputFileLoc;
    @Value(value = "${outputFile}")
    String outputFileLoc;
    @Autowired
    ArticleCountMapper articleCountMapper;
    @Autowired
    CPSProdEntity entity;
    @Autowired
    ArticleMetaData metaData;

    @Autowired
    DfReprepareMapper dfMapper;
    @Autowired
    DfReprepare reprepare;
    @Autowired
    ChubObjMapper chubObjMapper;
    @Autowired
    ChubObject chubObject;

    public void doService(String type) {
        System.out.println("Inside Service");
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(inputFileLoc));
//            TreeSet<String> uniq=null;
            int totalLines = lines.size();
            System.out.println("No .of input lines :" + totalLines);
            List<String> fields = type.equalsIgnoreCase("amd") ? metaData.getFields() : entity.getFields();
            String headers = fields.stream().collect(Collectors.joining(","));
            Files.write(Paths.get(outputFileLoc), List.of(headers));
          while (totalLines / partition >= 1) {
                List<String> currList = lines.subList(0, partition);
//                uniq=new TreeSet<>(currList);
                List<?> records = getRecords(currList, type);
                lines = lines.subList(partition, lines.size());
                write(records, type);
                totalLines -= partition;
            }
            List<?> records = getRecords(lines, type);
//            records.forEach(System.out::println);
            System.out.println("No .of output lines " + records.size());
            write(records, type);
        } catch (IOException ignored) {

        }
    }

    public List<?> getRecords(List<String> list, String type) {
        String sql;
        RowMapper mapper = type.equalsIgnoreCase("amd") ? amdMapper : cpsprodmapper;
        if (type.equalsIgnoreCase("amd")) sql = SqlUtil.ARTICLEID.getSql();
        else sql = SqlUtil.DELIVERYFILENAME.getSql();
        String ext = list.stream().map(i -> "'" + i.trim() + "'").collect(Collectors.joining(","));
        System.out.println("ext " + ext);
        System.out.println(list.size());
       sql = sql + "(" + ext + ")";
        System.out.println(sql);
        List query = jdbcTemplate.query(sql, mapper);
//        List query = jdbcTemplate.query(sql, new );
        return query;
    }

    public void write(List<?> records, String type) throws IOException {
//        List<?> records = getRecords(list, type);
        System.out.println("No .of output lines " + records.size());

        if (!type.equalsIgnoreCase("amd"))
            Files.write(Paths.get(outputFileLoc), records.stream().map(obj -> (CPSProdEntity) obj).map(CPSProdEntity::toString).toList(), StandardOpenOption.APPEND);
        else
            Files.write(Paths.get(outputFileLoc), records.stream().map(obj -> (ArticleMetaData) obj).map(ArticleMetaData::toString).toList(), StandardOpenOption.APPEND);
    }
}
