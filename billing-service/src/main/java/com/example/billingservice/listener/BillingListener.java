package com.example.billingservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BillingListener {

    @KafkaListener(topics = "order-topic", groupId = "billing-group")
    public void listen(String message) {
        System.out.println("Generating invoice for: " + message);
    }
}
