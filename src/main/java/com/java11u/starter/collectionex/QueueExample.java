package com.java11u.starter.collectionex;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String s[]){
        List<Integer> initialData = List.of(10, 20, 50, 40, 30);
        System.out.println("--------ArrayDeque-----------");
        System.out.println("Original values entered  : "+initialData);

        Queue<Integer> arrayDeque = new ArrayDeque<>(initialData);
        CollectionTests.doStuffWithCollection(arrayDeque, 60, 50 ,10);

        System.out.println("--------LinkedList-----------");
        System.out.println("Original values entered  : "+initialData);
        Queue<Integer> linkedList = new LinkedList<>(initialData);
        CollectionTests.doStuffWithCollection(linkedList, 60, 50 ,10);
    }
}
