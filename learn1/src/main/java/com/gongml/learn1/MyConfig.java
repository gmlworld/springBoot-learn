package com.gongml.learn1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @program: spring
 * @description: config
 * @author: Gongml
 * @create: 2018-10-25 17:42
 **/
@Configuration
public class MyConfig {

    @Bean
    public CarFactory creatCarFactory(){
        return new CarFactory();
    }

    @Bean
    public Car creatJeep(CarFactory factory){
        return  factory.create();
    }

    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean creatMyBean(){
        return new MyBean();
    }

    @Bean
    public RunnableFactoryBean creatRunnableFactoryBean(){
        return new RunnableFactoryBean();
    }


    @Bean
    public Cat creatCat(){
        return new Cat();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog createDog(){
        return  new Dog();
    }

    @Bean
    public Animal createAnimal(){
        return new Animal();
    }
}
