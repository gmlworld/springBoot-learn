package com.gongml.learn4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public MyJavaBean createMyJavaBean(){
        return new MyJavaBean();
    }
}
