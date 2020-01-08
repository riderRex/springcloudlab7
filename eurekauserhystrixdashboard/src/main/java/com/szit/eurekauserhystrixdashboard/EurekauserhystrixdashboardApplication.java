package com.szit.eurekauserhystrixdashboard;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker   //开启Hystrix断路器功能
@EnableHystrixDashboard //开启可视化时时监控服务的调用情况
@EnableEurekaClient //服务调用
public class EurekauserhystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekauserhystrixdashboardApplication.class, args);
        System.out.println("启动eureka-hystrix断路器功能！");
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


    /**
     * 在项目的启动类中，加入@EnableHystrixDashboard注解，
     * 打开断路器仪表盘功能。并添加ServletRegistrationBean，
     * 因为在SpringBoot 2.0及以上的版本中，
     * Springboot的默认路径不是 “/hystrix.stream”，所以我们手动加上即可。
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
