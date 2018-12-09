package com.gongml.learn4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    //容器初始化 加载完bean文件，bean未初始化 加载BeanFactoryPostProcessor 可获取配置类信息 包括设定是否单例模式
    //beanPostProcessor bean初始化之后  先调用before 再调用bean的init方法，再调用after方法
    //BeanDefinitionRegistryPostProcessor 传入参数BeanDefinitionRegistry 可以动态的创建bean
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.close();
    }
}
