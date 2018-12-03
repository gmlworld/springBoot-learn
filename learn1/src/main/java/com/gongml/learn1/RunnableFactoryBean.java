package com.gongml.learn1;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring
 * @description: factoryBean
 * @author: Gongml
 * @create: 2018-10-25 17:50
 **/
public class RunnableFactoryBean implements FactoryBean<Jeep> {

    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
