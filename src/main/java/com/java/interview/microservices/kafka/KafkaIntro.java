package com.java.interview.microservices.kafka;

public class KafkaIntro {
/*  Topics :
      - Topics ia a particular stream of data
      - Its similar to a table in a database (without all the constraints)
      - Topics are split in partitions
      - Topics can be considered as a logical entity
      - In Kafka cluster each topic is present in every cluster node
    Partitions :
      - Partitions can be considered as the linear data structure Just like array
      - Each partition is ordered
      - Each message within a partition gets an incremental id, called offset
      - New messages are always pushed at the read end as data is immutable after publish
      - In Multi broker Kafka cluster Partitions for a topic are distributed across the
        whole cluster
    Offset :
      - Offset only have a meaning for a specific partition

    - Order is guaranteed only within a partition (not across partitions)
    - Data is kept only for a limited time ( default is one week )
    - Once the data is written to a partition, it can't be changed (immutability)
    - Data is assigned randomly to a partition unless a key is provided

    Brokers :
    - A Kafka cluster is composed of multiple brokers (servers)
    - Each broker is identified with its ID (integer)
    - Each broker contains certain topic partitions
    - After connecting to any broker ( called bootstrap broker ), you will be connected to
      the entire cluster */



}
