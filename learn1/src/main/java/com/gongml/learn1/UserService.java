package com.gongml.learn1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring
 * @description: service
 * @author: Gongml
 * @create: 2018-10-25 20:04
 **/
@Service
public class UserService {
    public UserDao getUserDao() {
        return userDao;
    }
    public void show(){
        System.out.println(userDao);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    private UserDao userDao;
}
