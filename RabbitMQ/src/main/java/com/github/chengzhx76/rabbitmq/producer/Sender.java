package com.github.chengzhx76.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/28
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String random) {
//        String context = "hello " + System.currentTimeMillis();
//        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", random);
    }
}