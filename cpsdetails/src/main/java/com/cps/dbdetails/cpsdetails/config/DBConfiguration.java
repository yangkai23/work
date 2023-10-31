package com.cps.dbdetails.cpsdetails.config;

import org.postgresql.ds.PGSimpleDataSource;
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
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource("jdbc:postgresql://chub-common-dev.cluster-ro-cet0a3oez26m.us-west-2.rds.amazonaws.com:5432/cvtdb", "content_ro", "BO6O99miQ#AlmkJ2");
//        System.out.println(driverManagerDataSource.getConnectionProperties().toString());
        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerNames(new String
                []{"localhost"});
        //chub-common-prod.cluster-ro-cuz90kc407tp.us-west-2.rds.amazonaws.com
        ds.setPortNumbers(new int
                []{5432});
        ds.setUser("content_ro");
        ds.setPassword("YUl5#3wJ2e3FSelb");
        ds.setDatabaseName("contenthub");
        ds.setCurrentSchema("chub");
        return ds;
        // UAT: jdbc:oracle:thin:@//cps-amp-stable.czazctzymxax.us-west-2.rds.amazonaws.com:1521/CPSAMP
        // PROD: jdbc:oracle:thin:@//cps-prod.cb2flhonu4tz.us-west-2.rds.amazonaws.com:1521/CPSAMP
        // DEV: jdbc:oracle:thin:@//cps-amp-dev2.czazctzymxax.us-west-2.rds.amazonaws.com:1521/CPSAMP
        // Chub dev : jdbc:postgresql://chub-common-dev.cluster-cet0a3oez26m.us-west-2.rds.amazonaws.com:5432/cvtdb
        // Chub UAT : chub-common-uat.cluster-cet0a3oez26m.us-west-2.rds.amazonaws.com
        // Chub PROD : chub-common-prod.cluster-ro-cuz90kc407tp.us-west-2.rds.amazonaws.com
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

}
