package org.user.client.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.user.client.feign.fallback.UserFallback;

@FeignClient(name="service-eureka-client",fallback=UserFallback.class)
public interface UserFeignClient {

    @GetMapping("/listUsers")
    public String listUsers();

}
