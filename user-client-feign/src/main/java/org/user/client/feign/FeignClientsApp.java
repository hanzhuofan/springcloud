package org.user.client.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者 feign
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:23:37
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
