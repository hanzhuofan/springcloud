package org.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:23:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApp {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApp.class, args);
		System.out.println("ConfigServer已启动!");
	}
}
