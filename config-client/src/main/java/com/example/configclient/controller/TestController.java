package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyx
 * @Date: 2019-04-27 16:33
 * @Description:
 */
@RestController
public class TestController {

    @Value("${tag}")
    private String tag;

    @RequestMapping("/from")
    public String from(){
        return this.tag;
    }

}
