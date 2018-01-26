package org.springboot.dubbo.consumer.controller;

import org.springboot.dubbo.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2018/1/8
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private ConsumerService consumerService;

    @RequestMapping("/register")
    public String register() {
        return consumerService.register("111");
    }

    @RequestMapping("/test")
    public String test() {
        return consumerService.test();
    }
}
