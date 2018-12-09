package com.gongml.learn3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: spring
 * @description: app
 * @author: Gongml
 * @create: 2018-10-25 17:36
 **/
public class App {
    public static void main(String[] args) {
        //springBoot 注入applicationContext的三种方式
        //1.使用Autowired 2.在bean的构造函数中带有ApplicationContext的形参 3实现ApplicationContextAware接口
        //其中 ApplicationContextAware主要实现BeanPostProcessor 在初始化对象之后注入  参考：ApplicationContextAwareProcessor
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        context.close();
    }
}
