package com.exquisApp.dataingester.service;

import org.apache.kafka.clients.consumer.Consumer;

public interface DataIngesterService {

    void fetchData();
    void processData();
    void sendResult();

}
