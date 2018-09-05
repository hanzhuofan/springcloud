package org.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 服务端
 *	服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer// eureka 服务端注解
public class EurekaServerApp {
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApp.class, args);
    	System.out.println( "eureka 服务端已启动!" );
    }
}
