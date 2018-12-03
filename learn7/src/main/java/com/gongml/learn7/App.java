package com.gongml.learn7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

/**
 * EnvironmentPostProcessor  需要注册到META-INF/spring.factories
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App.class);
        /**
         * 使用profile的方式
         * 1.在初始化springApplication时，设置
         * 2.在运行时添加参数 --spring.profiles.active=test
         *          多个; test,dev,prod
         */
        springApplication.setAdditionalProfiles("test");
        ConfigurableApplicationContext run = springApplication.run(args);
        ConfigurableEnvironment environment = run.getEnvironment();

        TomcatProperty tomcatProperty = run.getBean(TomcatProperty.class);
        System.out.println(tomcatProperty.getHosts());
        System.out.println(Arrays.asList(tomcatProperty.getPorts()));
        System.out.println( environment.getProperty("ds.ports[0]"));

        System.out.println(environment.getProperty("springboot.name"));

        /**
         * 使用 test配置中的参数
         */
        System.out.println(environment.getProperty("jdbc.url"));
    }
}
