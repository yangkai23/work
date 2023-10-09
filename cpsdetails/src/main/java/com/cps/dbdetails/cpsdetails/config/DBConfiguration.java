package com.cps.dbdetails.cpsdetails.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DBConfiguration {
    @Bean
    public DataSource getDataSource() {
        System.out.println("Inside Config");
        return new DriverManagerDataSource("jdbc:oracle:thin:@//localhost:1521/CPSAMP", "cps_user", "cps_user");
        //UAT : jdbc:oracle:thin:@//cps-amp-stable.czazctzymxax.us-west-2.rds.amazonaws.com:1521/CPSAMP
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

}
