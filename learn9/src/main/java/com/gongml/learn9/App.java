package com.gongml.learn9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties
@EnableAsync
//@EnableAutoConfiguration
public class App {
    //EnableConfigurationProperties @ConfigurationProperties使能使用，在@EnableAutoConfiguration中
    //EnableAsync 与@Async配合使用

    //SpringBootApplication 主要实现为扫包 标识为配置文件，以及使能各项功能EnableAutoConfiguration
    //Enable类主要实现为Import注解，Import可以导入类和配置类 也可以导入ImportSelector接口的实现类，在实现方法中返回类路径数组
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(TomcatPerperties.class));
        context.getBean(Runnable.class).run();
        System.out.println("_____________--end");
        context.close();
    }
}
