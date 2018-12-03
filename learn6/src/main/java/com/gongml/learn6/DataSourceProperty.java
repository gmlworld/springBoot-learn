package com.gongml.learn6;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 11:01
 **/
@Data
@Component
@ConfigurationProperties(prefix = "ds")
public class DataSourceProperty {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public void show(){
        System.out.println("========jdbcConfig========");
        System.out.println("ds.url:"+url);
        System.out.println("ds.driverClassName:"+driverClassName);
        System.out.println("ds.username:"+username);
        System.out.println("ds.password:"+password);
    }
}
