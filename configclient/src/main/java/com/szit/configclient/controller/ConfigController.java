package com.szit.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    //定义属性
    @Value("${clientParam}")
    private String clientParam;

    @RequestMapping("/clientparam")
    public String getParam(){
        return clientParam;
    }

    @RequestMapping("/hello")
    public  String hello(){
        return "Helli,Spring Cloud Config Client配置客户端";
    }

}
