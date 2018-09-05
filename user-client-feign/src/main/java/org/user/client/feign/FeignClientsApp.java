package org.user.client.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者 feign
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignClientsApp {
	public static void main(String[] args) {
		SpringApplication.run(FeignClientsApp.class, args);
		System.out.println("FeignClients已启动!");
	}
}
