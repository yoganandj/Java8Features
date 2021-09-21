package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

public class Counter {

    private int i=0;

    public synchronized void increment(){
        i++;
    }

    public int getI(){
        return i;
    }
}
