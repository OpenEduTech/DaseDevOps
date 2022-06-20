package com.example.hello.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 李锦路
 * @create 2022-02-13-22:00
 */

//这里的FeignClient value的值是服务提供者的project name
@FeignClient(value = "hello-provider" )
public interface HelloClient {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", defaultValue = "DevOps", required = false) String name);
}
