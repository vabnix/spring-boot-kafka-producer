package com.vaibhav.kafka.producer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/publish/{message}")
    public String publishMessage(@PathVariable String message){
        kafkaTemplate.send("Kafka_message", message);
        return "Publish Successfully";
    }
}
