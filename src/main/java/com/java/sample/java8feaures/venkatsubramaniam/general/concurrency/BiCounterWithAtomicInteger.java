package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();


    public void increment(){
       i.incrementAndGet();
    }

    public int getI(){
        return i.get();
    }

    public void incrementJ(){
        j.incrementAndGet();
    }

    public int getJ(){
        return j.get();
    }
}
