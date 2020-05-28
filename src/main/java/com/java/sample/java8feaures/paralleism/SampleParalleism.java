package com.java.sample.java8feaures.paralleism;

/*
1. you needed to explicitly split the data structure containing your data into
        subparts. Second, you needed to assign each of these subparts to a different thread. Third, you
        needed to synchronize them opportunely to avoid unwanted race conditions, wait for the
        completion of all threads, and finally combine the partial results
2. Java 7 introduced a framework called fork/join to perform these operations
more consistently and in a less error-prone way

3. A parallel stream is a stream that
splits its elements into multiple chunks, processing each chunk with a different thread
4. Parallel streams internally use the default ForkJoinPool which by default has as many threads as you have processors, as
returned by Runtime.getRuntime().availableProcessors().
5. you can change the size of this pool using the system property
java.util.concurrent.ForkJoinPool.common.parallelism, as in the following example:
System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "12");
6. using the right data structure and then making it work in parallel guarantees
the best performance
6. Watch out for boxing. Automatic boxing and unboxing operations can dramatically hurt performance.
Java 8 includes primitive streams (IntStream, LongStream, and DoubleStream) to avoid such
operations, so use them when possible.

-----------------

8. The fork/join framework

9. It’s an
implementation of the ExecutorService interface, which distributes those subtasks to worker
threads in a thread pool, called ForkJoinPool.

10.
*/
public class SampleParalleism {
}
