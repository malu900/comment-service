package com.example.commentservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@EnableConfigurationProperties
@Configuration
@ConfigurationProperties(prefix = "welcome")
@Data
public class WelcomeConfiguration {
    private String message = "not from configmap";
}
