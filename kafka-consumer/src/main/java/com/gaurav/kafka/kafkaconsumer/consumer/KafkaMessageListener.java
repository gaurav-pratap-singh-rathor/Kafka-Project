package com.gaurav.kafka.kafkaconsumer.consumer;

import com.gaurav.kafka.kafkaconsumer.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);




    @KafkaListener(topics = "topicMessage",groupId = "group-message")
    public void consume2(String message) {
        log.info("consumer-message consume the message {} ", message);
    }

    @KafkaListener(topics = "topicCustomer",groupId = "group-customer")
    public void consumeEvents(Customer customer) {
        log.info("consumer-customer consume the events {} ", customer.toString());
    }



    @KafkaListener(topics = "topicCustomer",groupId = "group-customer")
    public void consume3(String message) {
        log.info("consumer-customer2 consume the message {} ", message);
    }

    @KafkaListener(topics = "topicCustomer",groupId = "group-customer")
    public void consume4(String message) {
        log.info("consumer-customer3 consume the message {} ", message);
    }
}
