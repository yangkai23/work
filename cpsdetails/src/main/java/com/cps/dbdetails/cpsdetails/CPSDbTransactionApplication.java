package com.cps.dbdetails.cpsdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cps.dbdetails.cpsdetails"})
public class CPSDbTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CPSDbTransactionApplication.class, args);
	}

}
