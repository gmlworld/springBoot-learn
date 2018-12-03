package com.gongml.learn1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring
 * @description: animal
 * @author: Gongml
 * @create: 2018-10-25 19:43
 **/
public class Animal {
    @PostConstruct
    public  void initial(){
        System.out.println("----------");
    }

    @PreDestroy
    public  void close(){
        System.out.println("--------------22---");
    }
}
