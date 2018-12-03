package com.gongml.learn7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 13:24
 **/
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Properties properties = new Properties();
        properties.setProperty("springboot.name", "learn7");
        PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("py",properties);
        environment.getPropertySources().addLast(propertiesPropertySource);
    }
}
