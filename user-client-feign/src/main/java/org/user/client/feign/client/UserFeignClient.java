package org.user.client.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.user.client.feign.fallback.UserFallback;

/**
 * @FeignClient(name=”service-eureka-client”) 标明feign调用的微服务名称
 * @GetMapping(“/listUsers”) 对应service-eureka-client微服务中的URL
 * UserFeignClient为实现feign的接口
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:26:51
 */
@FeignClient(name="service-eureka-client",fallback=UserFallback.class)
public interface UserFeignClient {

    @GetMapping("/listUsers")
    public String listUsers();

}
