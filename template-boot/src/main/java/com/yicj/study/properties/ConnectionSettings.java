package com.yicj.study.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix="connection")
public class ConnectionSettings {
    private String username;
    private String remoteAddress;
    private String password ;
}