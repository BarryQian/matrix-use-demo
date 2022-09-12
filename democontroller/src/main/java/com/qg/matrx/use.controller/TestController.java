package com.qg.matrx.use.controller;

import com.qg.matrx.use.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping(value = "/do/test")
    public String doTest(Integer num, String name, String identity){
       return testService.doTest(num, name, identity);
    }
}
