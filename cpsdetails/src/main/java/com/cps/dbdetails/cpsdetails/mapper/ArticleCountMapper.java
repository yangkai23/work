package com.cps.dbdetails.cpsdetails.mapper;

import com.cps.dbdetails.cpsdetails.dto.ArticleCount;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class ArticleCountMapper implements RowMapper<ArticleCount> {
    @Override
    public ArticleCount mapRow(ResultSet rs, int rowNum) throws SQLException {
        ArticleCount ac=new ArticleCount();
        ac.setOUTPUTBUNDLENAME(rs.getString(1));
        ac.setArticleCount(rs.getString(2));
        return ac;
    }
}
