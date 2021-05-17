package com.java11u.starter;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDataManipulation {
    public static void main(String s[]){
        // parallelSetAll and parallelSort are same as set and sort respectively but former is used
        // for larger sets of data , allow multiple threads to do work

        System.out.println("<--Manipulating data with Arrays static methods-------------->");

        Integer[] intArray = new Integer[10];
        System.out.println("Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        Arrays.fill(intArray, 5);
        System.out.println("After fill Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        int partialFilledValue = 9;
        Arrays.fill(intArray, 5, 10, partialFilledValue);
        System.out.println("After partial fill Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        // setAll introduced in Java 8

        Arrays.setAll(intArray , index -> index+1);
        System.out.println("Using setAll -  Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Sort Array -  Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Sort Array in reverse order -  Arrays.toString(intArray) = "+ Arrays.toString(intArray));

        Arrays.parallelPrefix(intArray, (left, right) -> left+right);
        System.out.println("Using parallelPrefix -  Arrays.toString(intArray) = "+ Arrays.toString(intArray));
    }
}
