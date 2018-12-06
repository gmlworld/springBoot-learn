package com.gongml.learn8;

import org.springframework.boot.SpringBootConfiguration;
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
}
