package com.example.commentservice;

import com.example.commentservice.config.WelcomeConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedularComponent {

    final
    WelcomeConfiguration welcomeConfiguration;

    public SchedularComponent(WelcomeConfiguration welcomeConfiguration) {
        this.welcomeConfiguration = welcomeConfiguration;
    }

    @Scheduled(fixedDelay = 100000)
    public void schedule() {
        System.out.println(welcomeConfiguration.getMessage());
    }
}
