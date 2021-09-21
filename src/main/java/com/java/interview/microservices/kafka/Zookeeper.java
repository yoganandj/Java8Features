package com.java.interview.microservices.kafka;

public class Zookeeper {
    /*Zookeeper :
      - Zookeeper is a distributed, open-source configuration, synchronization service
      - Zookeeper manages brokers (keep a list of them)
      - Zookeeper helps in performing leader election for partitions
      - Zookeeper sends notifications to Kafka in case of changes
        ex: new topic, broker dies, broker comes up, delete topics, etc ...
      - Zookeeper record
         - which messages consumer had read
         - Cluster information
         - Topic configuration

    - Kafka can not work without zookeeper
      -  Zookeeper by design operates with an odd number of servers( 3, 5,7 )
      -  Zookeeper has a leader (handle writes) the rest of the servers are
         followers (handle reads)


     - Kafka configuration - server.properties
       advertised.listeners=PLAINTEXT://your.host.name:9092
       zookeeper.connect=localhost:2181
       - start
         bin/kafka-server-start.sh config/server.properties

     - Kafka Manager
       -  Graphical user interface to view Kafka cluster


     - Zookeeper configuration - zookeeper.properties
       - start
         bin/zookeeper-server-start.sh config/zookeeper.properties


     */

}
