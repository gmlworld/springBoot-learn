package com.gongml.learn6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 09:35
 **/
@SpringBootApplication
public class App {
    //默认配置路径   resource/application.properties或者 resource/config/application.properties
    //获取配置中的值的两种方式：
        //1.使用Enviroment env； env.getProperty("")
         //2.使用注解@Value("${key}")
    //指定默认配置  支持classpath:/config  与 file:/config
    //三种方式指定配置
    //1.运行参数中添加
    // --spring.config.name= 可以指定配置文件的配置名
    // --spring.config.location = classpath:dirPath/config.properties  用来指定配置文件路径与配置名  多个配置使用, 逗号分割开 全路径
    //2.注解PropertySource
    //@PropertySource() 注解加载配置文件  多个PropertySource注解可以加在多个配置文件
    //PropertySources({@PropertySource(""),@PropertySource("")})
    //3.注解ConfigurationProperties
    //@ConfigurationProperties(prefix="") 配置前缀自动匹配变量值
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        Object hello = run.getBean("hello");
        JdbcConfig jdbcConfig = run.getBean("jdbcConfig",JdbcConfig.class);
        System.out.println(hello);
        System.out.println(jdbcConfig);
        jdbcConfig.show();

        DataSourceProperty dataSourceProperty = run.getBean(DataSourceProperty.class);
        dataSourceProperty.show();

    }
}
