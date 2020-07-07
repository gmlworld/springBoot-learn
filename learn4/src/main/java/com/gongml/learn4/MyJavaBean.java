package com.gongml.learn4;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

@Data
public class MyJavaBean implements InitializingBean {
    private String name ="gg";
    private int age;
    private String remark = "test";

    public MyJavaBean(){
        System.out.println(1111111111);
    }

//    @PostConstruct
//    public void  init(){
//        remark = "inited";
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        remark = "inited";
    }
}
