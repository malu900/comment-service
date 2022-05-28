package com.example.commentservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    @Primary
    public NewTopic codeTopic(){
        return TopicBuilder.name("topicOne").replicas(2).partitions(4)
                .build();
    }


}

