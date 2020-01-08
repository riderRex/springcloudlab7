package com.szit.eurekauser.controller;


import com.szit.eurekauser.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaUserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public String list() {
        return "Eureka 客户端测试。";
    }

    @GetMapping("/search/{id}")
    public Order findOrderByUser(@PathVariable Integer id) {
        //return restTemplate.getForObject("http://localhost:7900/order/" + id, Order.class);

        //使用Ribbon实现服务的负载均衡,访问服务提供者的地址发生了变化，直接使用已注册的服务名
        return restTemplate.getForObject("http://eurekaorder/order/"+id,Order.class);
    }
}
