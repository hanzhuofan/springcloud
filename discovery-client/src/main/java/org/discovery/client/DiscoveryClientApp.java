package org.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 获取用户信息 的服务提供者
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:20:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClientApp {
    public static void main( String[] args )
    {
    	SpringApplication.run(DiscoveryClientApp.class, args);
        System.out.println( "DiscoveryClient已启动!" );
    }
}
