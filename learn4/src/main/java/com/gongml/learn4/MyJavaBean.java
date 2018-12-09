package com.gongml.learn4;

import lombok.Data;

import javax.annotation.PostConstruct;

@Data
public class MyJavaBean {
    private String name ="gg";
    private int age;
    private String remark = "test";

    @PostConstruct
    public void  init(){
        remark = "inited";
    }

}
