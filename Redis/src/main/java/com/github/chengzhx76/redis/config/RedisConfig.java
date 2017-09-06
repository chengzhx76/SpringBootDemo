package com.github.chengzhx76.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

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
    @Bean
    public GenericJackson2JsonRedisSerializer jsonSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }

    @Bean
    public RedisConnectionFactory factory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("115.29.47.207");
        factory.setPort(6677);
        return factory;
    }

    @Bean
    public RedisTemplate<Serializable, Object> redisTemplate() {
        RedisTemplate<Serializable, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory());
        redisTemplate.setKeySerializer(stringSerializer());
        redisTemplate.setValueSerializer(jdkSerializer());
        redisTemplate.setHashKeySerializer(stringSerializer());
        return redisTemplate;
    }

}
