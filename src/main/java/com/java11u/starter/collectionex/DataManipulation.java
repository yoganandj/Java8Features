package com.java11u.starter.collectionex;

import java.util.ArrayList;
import java.util.List;

public class DataManipulation {
    public static void main(String s[]){
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("six");
        list1.add("seven");

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");

        list1.containsAll(list2);

        list1.addAll(list2); // A UNION B  - OR - A UNION ALL B(all members)

        list1.removeAll(list2); // A - B query result // remove elements from A where an intersection
        // of elements between A and B

        list1.retainAll(list2); // A intersection B query result



    }
}
