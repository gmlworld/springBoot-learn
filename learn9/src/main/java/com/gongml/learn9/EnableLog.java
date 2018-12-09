package com.gongml.learn9;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(MyImportSelector.class)
public @interface EnableLog {
    String name() default "";
}
