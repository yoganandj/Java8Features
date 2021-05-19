package com.java.interview;

public class APIGateway {
    /*1. Direct Call
       - multiple microservices - 7
       - so direct calls is 7*/

    /*2. API Gateway
            - API Composition call
            - Its call parellely - so improve performance wise */
    /*3. BFF (Backend for Frontend)
    *     - One API Gateway for Android apps
    *     - One API Gateway for IOS apps also
    * THis way we can compose different APIs and different response for
    * different clients using the same microservices
    */

    /*Also we can track the usage and ratelimit the 3rd party API usages*/

   /* Advantages :
    1. Authentication (tokent base authentication etc.)
    2. SSL termination
    3. LB
    4. Insulation */

   /*API gateway also helps to implement :
   * 1. Caching
   * 2. Managing access quotas
   * 3. API health monitoring
   * 4. API Versioning
   * 5. Chaos money testing
   * 6. A/B testing also
   * */
}
