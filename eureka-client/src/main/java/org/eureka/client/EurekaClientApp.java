package org.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka客户端
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:22:17
 */
@SpringBootApplication
@EnableEurekaClient // eureka客户端注解
public class EurekaClientApp {
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaClientApp.class, args);
        System.out.println( "eureka客户端已启动!" );
    }
}
