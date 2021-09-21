package com.java.interview;

public class MonolithicVsMicroservice {
    /*Monolithic :
    Advantages :
    1. Low complexity
    2. Easy to deploy
    Disadvantages :
    1. Rigid
    2. Hard to scale
    3. SLow performance
    4. SIngle point of failure
    5. SLow continuous Development
    6. Technology dependency
    7. Engineering focus -  very difficult to understand all code for implementing small feature or functionality
    8. Scaling data layers -  scaling all request to one database is very difficult
        -  Adding Read replicas of DB is possible but writes are still problem
    9. Overloaded VM/Containers
    10. Making better CI/CD pipeline , tests, Build and conflicts
    11. Understanding - newly on-board person can not understand really pain point */

    /*MicroServices :
    Advantages :
    1. Loosely Coupled
    2. Independent Development
    3. Independent deployment
    4. Fault Isolation
    5. Mixed Technology Stack
    6. Granular scaling
    7. Agile and Flexible
    8. Scaling easy
    9. Faster to develop and understand

    Disadvantages :
    1. High Complexity
    2. Consistency :  we consolidated transaction across different microservices
    3. Automation
    4. Debugging issues
    5. Interprocess communication is very difficult - not available, timeout ,taking lot of time
    6. Distributed transactions
    7. More resources - each service has its own resources
    8. Maintaining of hundred of hundred microservices is very difficult


    But we can avoid all disadvantages using container like kubernetes we can orestrate and automate

    Microservice Architecture:
    1. Functional Decomposition -  make individual services and independently deployable
       and horizontly scable and has its own individual database
    2. Scale Cube
       - Horizontal scale -  scale no of instances of similar services
       - Functional Decomposition
       - Data partitioning
    3. API Gateway
    4. Service Registry and Service Discovery
    5. Inter Microservices communication
    6. Circuit Breaking
       - Cache response
       - Fallback call
       - Recover of failing service by not using failing service
    7. Challenges - Service Mesh (Poxy Sidecar)
       - Load balancing
       - Service Discovery
       - Metrics
       - Retries
       - Circuit Breaking
       - Timeout
       - Distributed Transactions
          - Two phase commit
            -Prepare and Commit
            - Strong consistency
            Problems :
            - What happen if the co-ordinator fails?
            - What happens if the Microservice fails to reply during the phase 1
            Co-ordinator does not even know the state of the failed microservice
            -  What if the microservice fails during commit phase?

             In all of the above cases the resource is blocked and no others can use that resources

          -3 Phase commit
             -  Modified version of 2phase commit called 3 phase commit
             -
          -  2phase and 3phase commit are synchronous
          - Sagas
            -  Asynchronous
            -  Queue based implementation
            -  Sequence of local transactions
            -  Each local transaction updates the database and published the event for the next service
            -  if any of the local transaction fails then saga publishes COMPENSATING transactions to alll the
               services which have performed commit
              -  Types of transactions
                 - Compensating transaction
                 - Pivot transactions
                 - Retry transactions
             - Implementation - Choreography and Orestration

            When to use Sagas
              -  Ensure data consistency in a distributed system without tight coupling
              -  Rollback if one of the operations in the sequence fails
     */

}
