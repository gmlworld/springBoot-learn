package com.gongml.learn4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    //beanDefinitionRegiestry -->> beanFactory -->>beanPostProcess
    // beanDefinition 为spring的bean的核心对象，BeanFactory包含beanDefinition,初始化bean的构造方法后存在钩子函数接口BeanPostProcess，可以调用bean的初始化与释放方法
    //beanDefinition -->> 查找构造方法 反射 创建初始对象 --》注入到objectFactory中--》 放入三级缓存  objectFactory中  factoryBean  -->>调用factoryBean.get() 获取初始对象或代理对象 放入二级缓存中 --
    // BeanFactory  InitializingBean  -->> BeanFactory initMethod ->>BeanPostProcess ->> BeanPostProcess PostConstruct ->>放入一级缓存中--》清除二三级缓存
    //BeanPostProcess PreDestroy -->> BeanFactory destroyMethod -->> BeanFactory DisposableBean -->> distory
    //容器初始化 加载完bean文件，bean未初始化 加载BeanFactoryPostProcessor 可获取配置类信息 包括设定是否单例模式
    //beanPostProcessor bean初始化之后  先调用before 再调用bean的init方法，再调用after方法
    //BeanDefinitionRegistryPostProcessor 传入参数BeanDefinitionRegistry 可以动态的创建bean
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.close();
    }
}
