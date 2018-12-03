package com.gongml.learn6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 09:34
 **/
@Configuration
@PropertySource("classpath:learn6/hello.properties")
public class Config {
    @Bean("hello")
    public Hello creatHello() {
        Hello hello = new Hello();
        hello.setSay("hello world!");
        return hello;
    }
}
