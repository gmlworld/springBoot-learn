package com.gongml.learn1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description: user
 * @author: Gongml
 * @create: 2018-10-25 19:49
 **/
@Component
public class User {
    @Autowired
    private UserService userService;

    public void show(){
        System.out.println(userService);
    }
}
