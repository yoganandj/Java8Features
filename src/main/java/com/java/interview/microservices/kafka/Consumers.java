package com.java.interview.microservices.kafka;

public class Consumers {
    /*Consumers :
     - Consumers read data from a topic (identified by name)
     - Consumers know which broker to read from
     - In case of broker failures, consumers know how to recover
     - Data is read in order within each partitions
     - Every consumer is always assigned to a consumer group
     - if no group id is provided then random group id is assgined to consumer


     Consumer Groups :
       - How consumer read data from all partitions - answer is consumer groups
       - Consumers read data in consumer group
       - Consumer group can be defined as logical grouping of one or more consumer
       - It is mandatory for a consumer to register itself to a consumer group
       - Consumer wil automatically use a GroupCoordinator and a ConsumerCoordinator
         to assign a consumers to a partition
       - Consumer instance of same consumer group can be on different nodes(brokers)
       - One consumer can consume from more than one partition
       - Same partition can not be assigned to multiple consumer in same group



     Consumer Groups - what if too many consumers?
       -  if we have more consumers than partitions, some consumer will be inactive

     Consumer Offsets :

     Configuration needed by Consumer
       - topic
       - bootstrap_servers
       - group_id
     */
}
