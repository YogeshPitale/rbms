package com.wf.stp.rbms.listener.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
public class ServiceRouter {
    public void handleRecovery(ConsumerRecord<String, String> consumerRecord) {

    }
}
