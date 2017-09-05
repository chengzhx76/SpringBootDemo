package com.github.chengzhx76.redis.test;

import com.github.chengzhx76.redis.RedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApplication.class)
public class RedisApplicationTest {
    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;

    @Test
    public void test01() {
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set("1", "cheng");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
