package com.gongml.learn9;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tomcat")
@Data
public class TomcatPerperties {
    private String host;
    private String port;
}
