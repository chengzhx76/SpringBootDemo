package com.chengzhx76.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/17
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
