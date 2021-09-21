package com.java.interview.microservices.kafka;

public class KafkaConsoleProducerCLI {
    /*kafka-console-producer:
        --broker-list is required to connect to kafka
        --topic is required where to send message in kafka

     - to send message to kafka
      bin/kafka-console-producer --broker-list 127.0.0.1:9092 --topic first_topic

     - to add producer properties
       bin/kafka-console-producer --broker-list 127.0.0.1:9092 --topic first_topic --producer-property acks=all

    */
}
