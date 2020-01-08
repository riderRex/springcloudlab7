package com.szit.eurekauser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekauserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekauserApplication.class, args);
        System.out.println("Eureka Client客户端已经启动。");
    }

    /**
     * 通过REST风格访问远程HTTP服务
     * @return
     */
    @Bean
    @LoadBalanced   //添加Ribbon实现客户端服务的负载均衡功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
