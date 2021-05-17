package com.java11u.starter;

import java.util.Arrays;

public class ArrayTransformation {
    public static void main(String s[]){
        System.out.println("---------- Arrays.copyOf--------------");
        // elements initialized to null
        Integer[] originalArray = new Integer[10];

        Arrays.setAll(originalArray, index -> index+1);
        System.out.println("originalArray values "+Arrays.toString(originalArray));

        Integer[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("copiedArray values "+Arrays.toString(copiedArray));

        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);
        System.out.println("trimmedArray values "+Arrays.toString(trimmedArray));

        Integer[] widenArray = Arrays.copyOf(originalArray, 15);
        System.out.println("widenArray values "+Arrays.toString(widenArray));

        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("croppedArray values "+Arrays.toString(croppedArray));

        System.out.println("--------------------------------------- ");
        originalArray[0] = 66;
        System.out.println("originalArray values "+Arrays.toString(originalArray));
        System.out.println("copiedArray values "+Arrays.toString(copiedArray));
        System.out.println("trimmedArray values "+Arrays.toString(trimmedArray));
        System.out.println("widenArray values "+Arrays.toString(widenArray));

    }

}
