package org.user.client.feign;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.user.client.feign.LFSI.filter.MyFilter1;
import org.user.client.feign.LFSI.listener.MyHttpSessionListener1;
import org.user.client.feign.LFSI.listener.MyServletContextListener1;
import org.user.client.feign.LFSI.servlet.MyServlet1;

/**
 * 服务消费者 feign
 * 启动的顺序为listener->Filter->servlet(理(Listener)发(Filter)师(servlet))
 * Listener生命周期：一直从程序启动到程序停止运行。
 * Filter生命周期：程序启动调用Filter的init()方法，程序停止调用Filter的destroy()方法
 * Servlet生命周期：程序第一次访问，会调用servlet的init()方法初始化，每次程序执行都会根据请求调用doGet()或者doPost()方法，
 * 									程序停止调用destory()方法。
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:23:37
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ServletComponentScan//这个就是扫描相应的Servlet包;
public class FeignClientsApp {
	
	@Bean
	public ServletRegistrationBean<MyServlet1> MyServlet(){
		return new ServletRegistrationBean<MyServlet1>(new MyServlet1(), "/myServlet1/*");
	}
	
	@Bean
	public FilterRegistrationBean<MyFilter1> MyFilter(){
		return new FilterRegistrationBean<MyFilter1>(new MyFilter1(), new ServletRegistrationBean<Servlet>(new HttpServlet() {
			private static final long serialVersionUID = 1L;}, "/*"));
	}
	
	@Bean
	public  ServletListenerRegistrationBean<MyServletContextListener1> MyServletContextListener(){
		return new ServletListenerRegistrationBean<MyServletContextListener1>(new MyServletContextListener1());
	}
	
	@Bean
	public  ServletListenerRegistrationBean<MyHttpSessionListener1> MyHttpSessionListener(){
		return new ServletListenerRegistrationBean<MyHttpSessionListener1>(new MyHttpSessionListener1());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FeignClientsApp.class, args);
		System.out.println("FeignClients已启动!");
	}
}
