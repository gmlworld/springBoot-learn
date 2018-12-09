package com.gongml.learn4;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
        BeanDefinition bd = beanFactory.getBeanDefinition("createMyJavaBean");
        System.out.println("属性值============" + bd.getPropertyValues().toString());
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("remark")) {
            pv.addPropertyValue("remark", "把备注信息修改一下");
        }
//        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);

    }
}
