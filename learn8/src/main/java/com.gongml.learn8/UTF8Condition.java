package com.gongml.learn8;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = System.getProperty("file.encoding");
        if(property != null){
            return "utf-8".equals(property.toLowerCase());
        }
        return false;
    }
}
