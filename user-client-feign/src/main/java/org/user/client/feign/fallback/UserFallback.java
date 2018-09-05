package org.user.client.feign.fallback;

import org.springframework.stereotype.Component;
import org.user.client.feign.client.UserFeignClient;

/**
 * UserFallback为节点故障处理类
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:29:33
 */
@Component
public class UserFallback implements UserFeignClient {

	@Override
	public String listUsers() {
		// TODO Auto-generated method stub
		return "服务调用失败";
	}

}
