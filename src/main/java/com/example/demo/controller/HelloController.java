package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个测试Controller
 *
 * @author 庞建华 pangjianhua@winchannel.net
 * @create 2017-08-04 15:58
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hell worlsd";
    }
}
