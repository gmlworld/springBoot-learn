package com.gongml.learn1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description: app
 * @author: Gongml
 * @create: 2018-10-25 17:36
 **/
public class AnnotationClient {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.lenrn1");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("creatRunnableFactoryBean"));

        System.out.println(context.getBean("&creatRunnableFactoryBean"));
        //实现factoryBean 仅注入工厂到config
        System.out.println(context.getBean(RunnableFactoryBean.class));
        //工厂与类注入config
        System.out.println(context.getBean(Car.class));
        //实现方法InitializingBean，DisposableBean
        System.out.println(context.getBean(Cat.class));
        //指定初始化方法
        System.out.println(context.getBean(Dog.class));
        //JSR250注解
        System.out.println(context.getBean(Animal.class));

//        System.out.println(context.getBean(User.class));
//        System.out.println(context.getBean("user"));
//        System.out.println(context.getBeansOfType(User.class));

        context.close();
    }
}
