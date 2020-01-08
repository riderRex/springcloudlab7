package com.szit.eurekagatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient     //开启服务注册功能
@EnableZuulProxy    //开启Zuul的API网关功能
public class EurekagatewayzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekagatewayzuulApplication.class, args);
        System.out.println("启动Zuul的API网关功能。");
    }

}
