package com.chengzhx76.github.controller;

import com.chengzhx76.github.model.ConfigModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/17
 */
@RestController
public class ConfigFileController {

    @Value("${com.chengzhx76.github.desc}")
    private String desc;

    @Value("${run.env}")
    private String runEnv;

    @Autowired
    private ConfigModel config;

    @RequestMapping("/readConfig")
    public String readConfigFile() {
        return desc;
    }
    @RequestMapping("/runEnv")
    public String env() {
        return runEnv;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/config")
    public ConfigModel getConfig() {
        return config;
    }

}
