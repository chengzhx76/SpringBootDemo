package com.chengzhx76.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/17
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

}
