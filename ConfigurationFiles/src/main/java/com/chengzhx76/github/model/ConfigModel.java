package com.chengzhx76.github.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/17
 */
@Component
public class ConfigModel {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
