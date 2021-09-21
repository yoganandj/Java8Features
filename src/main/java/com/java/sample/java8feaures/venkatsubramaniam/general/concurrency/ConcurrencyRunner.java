package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

public class ConcurrencyRunner {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getI());
    }
}
