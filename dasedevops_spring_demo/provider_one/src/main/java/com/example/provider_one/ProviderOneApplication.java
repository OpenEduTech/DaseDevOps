package com.example.provider_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ProviderOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderOneApplication.class, args);
    }

    @Value("${server.port}")
    String port;


    //微服务hello提供者一号 返回当前响应的服务提供者端口号
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "DevOps",required = false) String name) {
        return "hello " + name + ", 我是微服务提供者1号 ,我的端口号是:" + port;

    }

}
