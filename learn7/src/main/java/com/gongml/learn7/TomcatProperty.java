package com.gongml.learn7;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring
 * @description:
 * @author: Gongml
 * @create: 2018-12-03 11:28
 **/
@Component
@PropertySource("classpath:learn7.properties")
@ConfigurationProperties(prefix="ds")
@Data
public class TomcatProperty {
    private List<String> hosts = new ArrayList<String>();
    private String[] ports;
}
