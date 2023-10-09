package com.cps.dbdetails.cpsdetails.mapper;

import com.cps.dbdetails.cpsdetails.dto.ArticleMetaData;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class AMDMapper implements RowMapper<ArticleMetaData> {
    @Override
    public ArticleMetaData mapRow(ResultSet rs, int rowNum) throws SQLException {
        ArticleMetaData metadata=new ArticleMetaData();

        metadata.setID(rs.getString(1));
        metadata.setCONTENT_PREP_ID(rs.getString(2));
        metadata.setJOURNAL_TITLE(rs.getString(3));
        metadata.setPUBLISHER_NAME(rs.getString(4));
        metadata.setVOLUME(rs.getString(5));
        metadata.setISSUE(rs.getString(6));
        metadata.setYEAR(rs.getString(7));
        metadata.setSOURCE_URI(rs.getString(8));
        metadata.setFPAGE(rs.getString(9));
        metadata.setARTICLEID(rs.getString(10));
        metadata.setPISSN(rs.getString(11));
        metadata.setEISSN(rs.getString(12));
        metadata.setINPUTBUNDLENAME(rs.getString(13));
        metadata.setOUTPUTBUNDLENAME(rs.getString(14));
        metadata.setCPSTIMESTAMP(rs.getString(15));
        metadata.setAMPACQUISITIONID(rs.getString(16));
        metadata.setCPSACQUISITIONTIMESTAMP(rs.getString(17));
        metadata.setCPSDELIVERYTIMESTAMP(rs.getString(18));
        metadata.setFEEDTYPE(rs.getString(19));
        metadata.setCREATED_DATE(rs.getString(20));
        metadata.setMODIFIED_DATE(rs.getString(21));

        return metadata;
    }
}
