package com.gongml.learn8;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfiguration {

    @Bean
    @ConditionalOnProperty(name="ruunable.enabled",havingValue = "true", matchIfMissing = true)
    public Runnable creatRunnable() {
        return () -> {
        };
    }

    @Bean
    @ConditionalOnClass(name = "com.google.gson.Gson")
    public Runnable createGsonRunnable(){
        return ()->{};
    }

    @Bean
    @ConditionalOnBean(name = "helllo")//无此bean不生效
    public Runnable createBeanRunnable(){
        return ()->{};
    }
}
