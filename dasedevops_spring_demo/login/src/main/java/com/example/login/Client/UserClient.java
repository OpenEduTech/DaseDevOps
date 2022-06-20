package com.example.login.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 李锦路
 * @create 2022-02-14-14:14
 */

//这里的FeignClient value的值是服务提供者的project name
@FeignClient(value = "login-provider" )
public interface UserClient {

    @PostMapping("/login")
    public String login(@RequestParam(value = "username", defaultValue = "devops", required = true) String username,
                        @RequestParam(value = "password", defaultValue = "devops", required = true) String password);
}
