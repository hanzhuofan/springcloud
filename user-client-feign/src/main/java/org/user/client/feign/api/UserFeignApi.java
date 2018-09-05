package org.user.client.feign.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.user.client.feign.client.UserFeignClient;

/**
 *  UserFeignApi为入口调用类
 * @author 韩卓帆
 * @date 2018年9月5日 下午1:26:06
 */
@RestController
public class UserFeignApi {

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/listUsersByFeign")
    public String ListUsers(){
        String users = this.userFeignClient.listUsers();
        return users;
    }

}