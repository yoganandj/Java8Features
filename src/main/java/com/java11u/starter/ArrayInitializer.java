package com.java11u.starter;

import java.util.Arrays;

public class ArrayInitializer {
    public static void main(String s[]){
        //int[][] name = new int[][8];

        // elements initialized to null
        Integer[] integerArray = new Integer[5];

        // elements initialized to 0
        int[] intArray = new int[5];

        System.out.println("Integer array : "+ Arrays.toString(integerArray));
        System.out.println("int array : "+Arrays.toString(intArray));

        for(int i=0;i<5;i++){
            integerArray[i] = intArray[i] = i+1;
        }

        System.out.println("Integer array : "+ Arrays.toString(integerArray));
        System.out.println("int array : "+Arrays.toString(intArray));

        //sorting and searching for manipulating arrays - java.util.Arrays
    }
}
