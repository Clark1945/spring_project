package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import com.example.demo.service.testService;


@RestController
public class testController {
    public final Logger logger = Logger.getLogger(String.valueOf(testController.class));
    @Autowired
    private testService testService;

    @GetMapping
    @RequestMapping("/hello")
    public String getHello(){
        logger.info("進來囉");
        logger.info("完成囉");
        return testService.testService();
    }
    @GetMapping
    @RequestMapping("/")
    ResponseEntity<Map<String,String>> random(){
        var hashmap = new HashMap<String,String>();
        Random random = new Random();
        hashmap.put("row",random.nextInt(7)+"");
        hashmap.put("column",random.nextInt(10)+"");
        return ResponseEntity.status(200).body(hashmap);
    }
}
