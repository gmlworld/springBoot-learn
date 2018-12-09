package com.gongml.learn9;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getAllAnnotationAttributes(EnableLog.class.getName()));
        //通过获取注解参数可以选择返回加载的类
        return new String[]{"com.gongml.learn9.User",Role.class.getName(),MyConfiguration.class.getName()};
    }
}
