package com.java.sample.lambda.examples;

import java.util.Arrays;
import java.util.List;

public class PerfomanceWithStreams {



    public static void main(String s[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
        System.out.println(numbers.parallelStream()
                .mapToInt(PerfomanceWithStreams::doubleIt)
                .sum()
                
        );
    }

    private static int doubleIt(Integer number) {
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        return number * 2;
    }
}
