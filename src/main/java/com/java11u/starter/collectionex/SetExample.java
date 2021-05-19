package com.java11u.starter.collectionex;

import java.util.*;

public class SetExample {
    public static void main(String s[]){
        List<Integer> initialData = List.of(10,20,50,40,50);

        Set<Integer> h = new HashSet<>(initialData);
        System.out.println("-------HashSet---------");
        System.out.println("Original values entered : "+initialData);

        CollectionTests.doStuffWithCollection(h, 60, 50, 10);

        Set<Integer> t = new TreeSet<>(initialData);
        System.out.println("-------TreeSet---------");
        CollectionTests.doStuffWithCollection(t, 60, 50, 10);

        Set<Integer> l = new LinkedHashSet<>(initialData);
        System.out.println("-------LinkedHashSet---------");
        CollectionTests.doStuffWithCollection(l, 60, 50, 10);

        if(h.equals(t)){
            System.out.println("Hashset h is equals to Treeset t");
        }else{
            System.out.println("Hashset h is NOT equals to Treeset t");
        }

        h.add(null);
        if(h.equals(l)){
            System.out.println("Hashset h is equals to LinkedHashSet t");
        }else{
            System.out.println("Hashset h is NOT equals to LinkedHashSet t");
        }
    }
}
