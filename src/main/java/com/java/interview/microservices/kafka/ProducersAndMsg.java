package com.java.interview.microservices.kafka;

public class ProducersAndMsg {
    /*Producers :
     - Producers automatically know to which broker and partition to write to
     - in case of Broker failures, Producer will automatically recover

     - Producer can choose to receive acknowledgement of data writes
       - acks=0 : Producer wont wait for acknowledgment (possible data loss)
       - acks=1 : Producer will wait for leader acknowledgment (limited data loss)
       - acks=all : Leader + replicas acknowledgment (no data loss)

     Producers: Message Keys
      - Producer can choose to send a key with the message (String, number etc..)
      - if key=null, data is sent round robin (broker 101 then broker 102 then broker 103
      - if a key is sent, then all messages for that key will always go to the same partition
      - A key is basically sent if we need message ordering for a specific field(ex: truck_id)

      Partition method with three parameters
       - Key_bytes
       - all_partition
       - available_partition
      */
}
