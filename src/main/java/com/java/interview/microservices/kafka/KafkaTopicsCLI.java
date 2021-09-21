package com.java.interview.microservices.kafka;

public class KafkaTopicsCLI {
    /*kafka-topics :
     - list all topics
        bin/kafka-topics --zookeeper 127.0.0.1:2181 --list

      - topic description
        bin/kafka-topics --zookeeper 127.0.0.1:2181 --topic first_topic --describe

      - create new topic
        bin/kafka-topics --zookeeper 127.0.0.1:2181 --topic first_topic --create --partitions 3 --replication-factor 1

      - delete topic
        bin/kafka-topics --zookeeper 127.0.0.1:2181 --topic second_topic --delete
        */

}
