package com.java.sample.java8feaures.venkatsubramaniam.streams;

import java.util.Arrays;
import java.util.List;

public class StreamCharacteristics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

        numbers.stream()
               .filter(e -> e%2 ==0)
               .forEach(System.out :: println);

        // sized, ordered, non-distinct, non-sorted

        System.out.println("Convert to sorted --------------");

        // to convert to sorted
        numbers.stream()
                .filter(e -> e%2 ==0)
                .sorted()
                .forEach(System.out :: println);


        System.out.println("nor-sorted distinct  --------------");

        // non-sorted distinct
        numbers.stream()
                .filter(e -> e%2 ==0)
                .distinct()
                .forEach(System.out :: println);

    }
}
