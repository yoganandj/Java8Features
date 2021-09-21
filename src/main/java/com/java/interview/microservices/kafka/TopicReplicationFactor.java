package com.java.interview.microservices.kafka;

public class TopicReplicationFactor {
    /*Topic Replication Factor :
    -Kafka is fault tolerant:
      - Ability of a system to continue operating without interruption when one or more
        of its component fail
    -Each partition is replicated across multiple server for fault tolerance
    -Only one partition will be active at a time can called Leader.
     (Active partition is called as Leader) . Other partition will only replicate
     message and called Followers (Non Active Partitions are called Followers)
    -The leader handles all read and write request for the partition while followers
     passively replicate the leader

    - Each partition has one leader and multiple ISR(In-sync replica)

    Ex: if There are 3 brokers then topics should have a replication factor >1
            (usually between 2 and 3)*/
}
