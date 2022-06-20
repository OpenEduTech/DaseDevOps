package com.example.provider_three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ProviderThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderThreeApplication.class, args);
    }


    //假验证登录
    @PostMapping("/login")
    public String login(@RequestParam(value = "username", defaultValue = "devops",required = true) String username ,
                        @RequestParam(value = "password", defaultValue = "devops",required = true) String password){
        if(username==null||password==null)
        {
            return "登录失败";
        }
        if(username.equals("admin")&&password.equals("123456789"))
        {
            return "登录成功，欢迎使用";
        }
        return "登录失败";

    }

}
