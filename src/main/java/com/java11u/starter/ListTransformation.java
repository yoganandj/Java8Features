package com.java11u.starter;

import java.util.Arrays;
import java.util.List;

public class ListTransformation {
    public static void main(String s[]){
        Integer[] integerArray = new Integer[10];

        Arrays.setAll(integerArray,  index -> index+1);

        List anotherList = List.of(integerArray);

        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        System.out.println("integerArray = "+Arrays.toString(integerArray));
        System.out.println("anotherList = "+anotherList);
        System.out.println("repeatedArray = "+Arrays.toString(repeatedArray));

        System.out.println("--------------------------------------");
        repeatedArray[0] = 11;

        System.out.println("anotherList = "+anotherList);
        System.out.println("repeatedArray = "+Arrays.toString(repeatedArray));

    }
}
