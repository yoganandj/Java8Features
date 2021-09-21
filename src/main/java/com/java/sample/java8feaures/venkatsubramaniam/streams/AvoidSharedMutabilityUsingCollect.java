package com.java.sample.java8feaures.venkatsubramaniam.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvoidSharedMutabilityUsingCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

        List<Integer> doubleOfEven = new ArrayList<>();

        numbers.stream()
               .filter( e ->  e%2 == 0 )
               .map( e -> e*2 )
               .forEach( e -> doubleOfEven.add(e));
        System.out.println(doubleOfEven); // dont this

        // collect
        List<Integer> doubleOfEven2 = numbers.stream()
                .filter( e ->  e%2 == 0 )
                .map( e -> e*2 )
                .collect(Collectors.toList());

        System.out.println(doubleOfEven2);

    }
}
