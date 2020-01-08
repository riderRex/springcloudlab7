package com.szit.eurekaorder.controller;

import com.szit.eurekaorder.pojo.Order;
import com.szit.eurekaorder.util.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    /**
     * 通过id查询订单
     *
     * @param id 订单号
     * @return 返回Order订单实体对象
     */
    @GetMapping("/order/{id}")
    public Order search(@PathVariable Integer id) {
        Order order = new Order(id, 23.5, "张三丰", "北京市故宫", "13510982068");

        //打印服务提供者的端口：验证Ribbon负载均衡
        System.out.println("当前服务提供者的端口："+ServiceInfoUtil.getPort());

        return order;
    }
}
