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
 * 在启动类中@Bean 将 restTemplate注入到ioc容器, 并使用@LoadBalanced 注解声明开启 负载均衡
 * 启动类添加 @EnableHystrix 注解以开启 Hystrix 特性
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:31:10
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
