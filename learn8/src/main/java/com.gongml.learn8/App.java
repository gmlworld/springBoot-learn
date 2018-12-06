package com.gongml.learn8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        //-Dfile.encoding=GBK  运行参数可以修改
        //@Conditional(Condition.class)  可接受多个condition只有多个全部满足 才生效
        //condition用于bean仅仅方法有效  用于配置类，全部配置有效
        //@ConditionOnClass当class存在时装配  @ConditionOnMissClass当class不存在容器时装配
        //@ConditionalOnProperty(name="runnable.enabled",havingValue = "true", matchIfMissing = true)
        //当存在配置runnable.enabled=true时有效，matchIfMissing =true 配置不存在也是生效的
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBeansOfType(EncodingConvert.class));
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(context.getBeansOfType(Runnable.class));

    }
}
