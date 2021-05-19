package com.java.interview.microservices;

public class SynchronousVsAsynchronous {

   /*
    Synchronous :

    Advantages :
    1. Easy to call
    2. Realtime :  get realtime response without waiting for a time

    Disadvantages :
    1.  Service availability - if not available - caller microservice will be also down
    2.  Response time -  latency will be added for every call as it is synchronous


    Asynchronous :

    Advantages:
    1. Faster API
    2. Decoupled services
    3. works even when services are down
    4. NO need for service discovery

    Disadvantages :
    1. Complex design - will have more components
    2. Process latency - if queue is overloaded microservice might delayed to finish his job
    3. Monitory costs
    */
}
