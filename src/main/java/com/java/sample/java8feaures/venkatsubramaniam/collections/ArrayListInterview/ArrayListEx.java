package com.java.sample.java8feaures.venkatsubramaniam.collections.ArrayListInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ArrayListEx {
    //1. Accept duplicates
    //2. Insertion order
    //3. Current Capacity * 3/2 +1
    //4. Once new array is created old array will be eligible for garbage collection

    //Disadvantages:
    //1. For inserting elements in the middle of the list is a bad choice it affect performance
    //2.
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList1 = new ArrayList<>();
        intArrayList1.add(1);
        intArrayList1.add(2);
        intArrayList1.add(3);
        intArrayList1.add(4);
        intArrayList1.add(5);

        HashSet set = null;
        set.add("");

        HashMap map = null;
        map.put("","")
;

        intArrayList1.remove(1);
        intArrayList1.remove(3);

        System.out.println(intArrayList1);
        System.out.println("-------------------------------------");

        List<Integer> intArrayList2 = new ArrayList<>(8);
        intArrayList2.add(10);
        intArrayList2.add(20);
        intArrayList2.add(30);
        intArrayList2.add(40);
        intArrayList2.add(50);

        System.out.println(intArrayList2);
        System.out.println("-------------------------------------");

        List<Integer> intArrayList3 = new ArrayList<>(intArrayList2);
        intArrayList2.add(100);
        intArrayList2.add(200);


        System.out.println(intArrayList3);
        System.out.println("-------------------------------------");

    }
}
