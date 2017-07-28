package com.github.chengzhx76.rabbitmq.test;

import com.github.chengzhx76.rabbitmq.RabbitMQApplication;
import com.github.chengzhx76.rabbitmq.producer.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMQApplication.class)
public class RabbitMQApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (;;) {
            int random = new Random().nextInt(20);
            sender.send(random+"");
            Thread.sleep(random);
        }
    }

}
