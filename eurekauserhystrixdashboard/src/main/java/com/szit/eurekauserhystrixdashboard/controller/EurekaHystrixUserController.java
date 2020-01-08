package com.szit.eurekauserhystrixdashboard.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.szit.eurekauserhystrixdashboard.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaHystrixUserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public String list() {
        return "Eureka 客户端测试。";
    }

    @GetMapping("/search/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo") //指定当前方法发生异常时调用的方法
    public Order findOrderByUser(@PathVariable Integer id) {
        //return restTemplate.getForObject("http://localhost:7900/order/" + id, Order.class);

        //使用Ribbon实现服务的负载均衡,访问服务提供者的地址发生了变化，直接使用已注册的服务名
        return restTemplate.getForObject("http://eurekaorder/order/" + id, Order.class);
    }

    /**
     * 回调方法：返回熔断信息的方法
     * 回调方法的参数类型及返回类型必须要和原方法保持一致
     *
     * @param id
     * @return
     */
    public Order fallbackInfo(@PathVariable Integer id) {
        return new Order(id, 23.5, "张三丰", "服务不可用，请稍后再试！", "13510982068");
    }
}
