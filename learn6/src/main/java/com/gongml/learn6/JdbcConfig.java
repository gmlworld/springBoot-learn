package com.gongml.learn6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 10:25
 **/
@Component
public class JdbcConfig {
    @Value("${jdbc.url}")
    private  String url;

    public void  show(){
        System.out.println("url:"+url);
    }
}
