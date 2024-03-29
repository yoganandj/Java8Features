package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListRunner {
    //
    //add -- its copy entire array and replace with new array
    //get  -- meanwhile other threads can read the list
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

//        Threads - 3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

//        Threads - 1000
        for (String element : list){
            System.out.println(element);
        }
    }
}
