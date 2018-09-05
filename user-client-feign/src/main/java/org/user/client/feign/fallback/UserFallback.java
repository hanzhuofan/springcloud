package org.user.client.feign.fallback;

import org.springframework.stereotype.Component;
import org.user.client.feign.client.UserFeignClient;

@Component
public class UserFallback implements UserFeignClient {

	@Override
	public String listUsers() {
		// TODO Auto-generated method stub
		return "服务调用失败";
	}

}
