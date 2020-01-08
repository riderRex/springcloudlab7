package com.szit.eurekaorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaorderApplication.class, args);
        System.out.println("Eureka Order订单提供者已经启动。");
    }
}
