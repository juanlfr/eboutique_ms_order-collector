package com.juanlfr.eboutique.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    private static final String TOPIC = "orders";

    @Bean
    public NewTopic topic1() {
        return new NewTopic(TOPIC, 1, (short) 1);
    }
}
