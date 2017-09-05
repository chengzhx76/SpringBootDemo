package com.github.chengzhx76.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/5
 */
@Configuration
public class RedisConfig {

    @Bean
    public StringRedisSerializer stringSerializer() {
        return new StringRedisSerializer();
    }
    @Bean
    public JdkSerializationRedisSerializer jdkSerializer() {
        return new JdkSerializationRedisSerializer();
    }
//    @Bean
//    public GenericJackson2JsonRedisSerializer jsonSerializer() {
//        return new GenericJackson2JsonRedisSerializer();
//    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(stringSerializer());
        redisTemplate.setValueSerializer(jdkSerializer());
        redisTemplate.setHashKeySerializer(stringSerializer());
        return redisTemplate;
    }

}
