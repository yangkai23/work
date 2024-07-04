package com.cps.dbdetails.cpsdetails.mapper;

import com.cps.dbdetails.cpsdetails.dto.CPSProdEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class CPSProdEntityMapper implements RowMapper<CPSProdEntity> {

    @Override
    public CPSProdEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        CPSProdEntity entity=new CPSProdEntity();
//        System.out.println("Inside Mapper");
        entity.setName(rs.getString(1));
        entity.setReceiptId(rs.getString(2));
        entity.setPrepId(rs.getString(3));
        entity.setWorkflowId(rs.getString(4));
        entity.setFileName(rs.getString(5));
        entity.setContentInfo(rs.getString(6));
        entity.setModifiedDate(rs.getString(7));
        entity.setCreatedDate(rs.getString(8));
        entity.setPguid(rs.getString(9));
        entity.setResponseCode(rs.getString(10));
        entity.setResponseMessage(rs.getString(11));
        entity.setAcqStatus(rs.getString(12));
        entity.setStatus(rs.getString(13));
        entity.setCount(rs.getString(14));
        entity.setProbotId(rs.getString(15));
        entity.setDeliveryFileName(rs.getString(16));
        return entity;
    }
}
