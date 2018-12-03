package com.gongml.learn1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @program: spring
 * @description: cat
 * @author: Gongml
 * @create: 2018-10-25 19:35
 **/
public class Cat implements InitializingBean,DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("11111111111111111111111111111111111");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("222222222222222222222222");
    }
}
