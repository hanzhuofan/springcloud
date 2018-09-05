package org.discovery.client.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

	@Value("${server.port}")
	String serverPort;

	@GetMapping("/listUsers")
	public String ListUsers() {
		/**
		 * 模拟从数据库查询
		 */
		List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
		for (int i = 1; i < 5; i++) {
			Map<String, Object> user = new HashMap<String, Object>();
			user.put("id", i);
			user.put("name", "小明" + i);
			users.add(user);
		}
		return "服务器端口号：   " + serverPort + "   |   用户信息：   " + users.toString();
	}
}
