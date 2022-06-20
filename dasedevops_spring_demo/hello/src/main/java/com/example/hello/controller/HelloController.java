package com.example.hello.controller;

/**
 * @author 李锦路
 * @create 2022-02-13-22:00
 */

import com.example.hello.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloClient helloClient;


    //调用provider1号和2号的服务
    @GetMapping("/hello-feign")
    public String hello(){
        return helloClient.hello("DevOps");
    }


}
