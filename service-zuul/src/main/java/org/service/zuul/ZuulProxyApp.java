package org.service.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关zuul
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulProxyApp {
    public static void main( String[] args )
    {
    	SpringApplication.run(ZuulProxyApp.class, args);
        System.out.println( "ZuulProxy已启动!" );
    }
}
