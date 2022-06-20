package com.example.login.web;


import com.example.login.Client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李锦路
 * @create 2022-02-14-14:11
 */

@RestController
public class UserController {

    @Autowired
    UserClient userClient;

    @PostMapping("/login")
    public String login(@RequestParam(value = "username", defaultValue = "devops",required = true) String username ,
                        @RequestParam(value = "password", defaultValue = "devops",required = true) String password){
        return userClient.login(username,password);
    }
}
