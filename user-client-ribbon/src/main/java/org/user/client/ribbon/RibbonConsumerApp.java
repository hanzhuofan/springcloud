package org.user.client.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者ribbon
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class RibbonConsumerApp {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(RibbonConsumerApp.class, args);
        System.out.println( "RibbonConsumer已启动!" );
    }
}
