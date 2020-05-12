package com.yicj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TemplateBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TemplateBootApplication.class, args);
        run.close();
    }

}