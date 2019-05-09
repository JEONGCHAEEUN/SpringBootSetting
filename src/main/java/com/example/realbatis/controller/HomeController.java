package com.example.realbatis.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.realbatis.mapper.BasicMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Resource
    BasicMapper basicMapper;
    
    @GetMapping(value="/") 
    public String home() {
        return "this is home"; 
    }

    @GetMapping(value="/api") 
    public List getList() {
        return basicMapper.list(); 
    }
}