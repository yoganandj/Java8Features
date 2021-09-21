package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

public class BiCounter {

    private int i=0;
    private int j=0;

    public synchronized void increment(){
        i++;
    }

    public int getI(){
        return i;
    }

    public synchronized void incrementJ(){
        j++;
    }

    public int getJ(){
        return j;
    }
}
