package com.cps.dbdetails.cpsdetails.controller;

import com.cps.dbdetails.cpsdetails.dao.CpsDbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("db/cps-api")
public class DbController {

    @Autowired
    CpsDbDao service;
@GetMapping("/search")
public String getDetailsUsingPrepId(@RequestParam String type) throws IOException {
    System.out.println("Inside Controller");
long startTime=System.currentTimeMillis();
    service.doService(type);
    long endTime=System.currentTimeMillis();
    System.out.println("Time taken : "+(endTime-startTime)/1000);
    return "Success";
}

}
