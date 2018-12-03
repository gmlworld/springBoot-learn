package com.gongml.learn1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @program: spring
 * @description: scan
 * @author: Gongml
 * @create: 2018-10-25 20:24
 **/
@ComponentScan(basePackages = "com.lenrn1", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes={UserController.class,UserService.class}))
@Configuration
public class AnnotationScan {
}
