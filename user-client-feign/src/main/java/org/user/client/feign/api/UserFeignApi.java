package org.user.client.feign.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.user.client.feign.client.UserFeignClient;

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