package com.szit.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope   //动态刷新配置文件读取内容
@RestController
public class ConfigclientApplication {
//    //定义属性
//   @Value("${clientParam}")
//    private String clientParam;
//
//    @RequestMapping("/clientparam")
//    public String getParam(){
//        return clientParam;
//    }
//
//    @RequestMapping("/hello")
//    public  String hello(){
//        return "Helli,Spring Cloud Config Client配置客户端";
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
        System.out.println("启动Spring Cloud Client配置客户端。");
    }

}
