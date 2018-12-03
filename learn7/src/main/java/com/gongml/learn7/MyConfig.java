package com.gongml.learn7;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 20:49
 **/

/**
 * @Profile("test") 可以用于配置类或者bean上面
 */
@SpringBootConfiguration
public class MyConfig {

    @Bean
    public Runnable createRunnable1(){
        System.out.println("----1----");
        return ()->{};
    }

    @Bean
    @Profile("test")
    public Runnable createRunnable2(){
        System.out.println("----2----");
        return ()->{};
    }

    @Bean
    @Profile("prod")
    public Runnable createRunnable3(){
        System.out.println("----3----");
        return ()->{};
    }


}
