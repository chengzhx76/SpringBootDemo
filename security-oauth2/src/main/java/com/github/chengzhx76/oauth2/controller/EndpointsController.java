package com.github.chengzhx76.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/11
 */
@RestController
public class EndpointsController {

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        //for debug
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " + id;
    }
    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        //for debug
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id;
    }
}
