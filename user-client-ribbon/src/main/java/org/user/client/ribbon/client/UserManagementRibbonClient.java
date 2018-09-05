package org.user.client.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * service-eureka-client 为服务名称， 一个服务名称对应多个主机IP和端口号，
 * 这样根据服务名调用就实现了负载均衡的功能
 * 使用 @HystrixCommand 注解的 fallbackMethod 指定失败方法，并实现该方法：
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:32:04
 */
@RestController
public class UserManagementRibbonClient {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${server.port}")
    String port;
	
	@GetMapping("/listUsersByRibbon")
	@HystrixCommand(fallbackMethod="listUsersByRibbonFallback")
	public String ListUsersByRibbon(){
        String result = this.restTemplate.getForObject("http://service-eureka-client/listUsers", String.class);
        return result;
    }
	
	public String listUsersByRibbonFallback(){
        return "listUsersByRibbon异常，端口：" + port;
    }
}
