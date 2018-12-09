package com.gongml.learn9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan
//方式1：@Import({User.class,Role.class,MyConfiguration.class})  直接导入类或配置类
//方式2：@Import(MyImportSelector.class)  导入ImportSelector 在selector中导入类全路径名
//方式3：自定义注解EnableLog 注解中包含@Import 可以根据注解传入参数，选择返回的类路径 相当于在Import上包装了一些传入参数，通过传入参数选择ImportSelector返回的值
@EnableLog(name = "hello")
public class App2 {

    //SpringBootCompan
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }
}
