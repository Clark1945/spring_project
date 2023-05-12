package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("testService")
public class testService {
    public String testService(){
        return "hello";
    }
}
