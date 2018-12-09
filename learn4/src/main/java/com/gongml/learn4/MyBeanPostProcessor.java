package com.gongml.learn4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass()==MyJavaBean.class){
            System.out.println(bean);
        }
        return bean;
    }

   @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       if(bean.getClass()==MyJavaBean.class){
           System.out.println(bean);
       }
        return bean;
    }
}
