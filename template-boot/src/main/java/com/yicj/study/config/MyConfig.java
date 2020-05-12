package com.yicj.study.config;

import com.yicj.study.properties.ConnectionSettings;
import com.yicj.study.service.HelloService;
import com.yicj.study.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(ConnectionSettings.class)
public class MyConfig {

    @Autowired
    private ConnectionSettings connectionSettings ;
    @Bean
    public HelloService userService (){
        System.out.println("=====> " + connectionSettings);
        return new HelloServiceImpl() ;
    }

}