package com.szit.eurekaorder.util;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 服务监听类：为了实现Ribbon负载均衡
 * @author 知领互联
 * @version 1.0 2020-1-3
 */
@Configuration //注册组件
//spring boot2.0已经将EmbeddedServletContainerInitializedEvent改成了WebServerInitializedEvent
//public class ServiceInfoUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent>{

    /**
     * 声明event对象，该对象用于获取运行服务器的本地端口
     */
    //private static EmbeddedServletContainerInitializedEvent event;
    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        ServiceInfoUtil.event=event;
    }

    /**
     * 获取端口
     * @return
     */
    public static int getPort(){
        return event.getWebServer().getPort();
    }
}
