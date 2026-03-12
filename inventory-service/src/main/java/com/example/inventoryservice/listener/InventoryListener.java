package com.example.inventoryservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryListener {

    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void listen(String message) {
        System.out.println("Updating stock for: " + message);
    }
}
