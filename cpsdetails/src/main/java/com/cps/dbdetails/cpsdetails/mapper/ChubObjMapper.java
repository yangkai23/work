package com.cps.dbdetails.cpsdetails.mapper;

import com.cps.dbdetails.cpsdetails.dto.ChubObject;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class ChubObjMapper implements RowMapper<ChubObject> {
    @Override
    public ChubObject mapRow(ResultSet rs, int rowNum) throws SQLException {
        ChubObject chub = new ChubObject();
        chub.setDocPguid(rs.getString(1));
        chub.setFilePath(rs.getString(2));
        chub.setFileName(rs.getString(3));
        return chub;
    }
}
