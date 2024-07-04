package com.cps.dbdetails.cpsdetails.mapper;

import com.cps.dbdetails.cpsdetails.dto.DfReprepare;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class DfReprepareMapper implements RowMapper<DfReprepare> {
    @Override
    public DfReprepare mapRow(ResultSet rs, int rowNum) throws SQLException {
        DfReprepare reprepare = new DfReprepare();
        reprepare.setName(rs.getString(1));
        reprepare.setFilename(rs.getString(2));
        reprepare.setContentInfo(rs.getString(3));
        reprepare.setDfname(rs.getString(4));
        reprepare.setWorkflow_id(rs.getString(5));
        reprepare.setStatus(rs.getString(6));
        return reprepare;
    }
}
