package com.java.sample.java8feaures.venkatsubramaniam.streams;

import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {
        // infinite stream - and it is un-sized stream
        System.out.println(Stream.iterate(100, e -> e+1));

//        start with 100 and create a series
//        100 , 101, 102 , 103, ....
    }
}
