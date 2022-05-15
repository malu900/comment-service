package com.example.commentservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
@Data
public class WelcomeConfiguration {
    private String message = "not from configmap";
}
