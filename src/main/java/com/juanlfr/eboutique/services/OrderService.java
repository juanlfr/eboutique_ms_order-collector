package com.juanlfr.eboutique.services;

import com.juanlfr.eboutique.dto.Purchase;
import com.juanlfr.eboutique.dto.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private static final String TOPIC = "orders";

    @Autowired
    private KafkaTemplate<String, Purchase> kafkaTemplate;

    public PurchaseResponse processOrder(Purchase purchase) {
        kafkaTemplate.send(TOPIC,"key", purchase);
        return new PurchaseResponse(generateTrackingNumber());
    }

    private String generateTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
