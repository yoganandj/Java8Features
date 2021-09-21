package com.java.sample.java8feaures.venkatsubramaniam;

import com.java.sample.java8feaures.venkatsubramaniam.util.Timeit;

import java.util.Arrays;
import java.util.List;

public class FunctionComposition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,9,3,1,5,8,10,6,2,7);

        // given the values, double the even numbers and total.

        int result = 0;

        for(int e : numbers){
            if(e%2 ==0){
                result = result + e *2;
            }
        }
        System.out.println(result);


        // function composition :  function pipelines

        System.out.println(numbers.stream()
                .filter(e -> e%2 ==0)
                .map(e -> e*2)
                .reduce(0, Integer :: sum));


        System.out.println(numbers.stream()
                .filter(e -> e%2 ==0)
                .mapToInt(e -> e*2)
                .sum());

        Timeit.code(() ->
        System.out.println("without compute : "+numbers.stream()
                .filter(e -> e%2 ==0)
                .mapToInt(e -> e*2)
                .sum()));

        Timeit.code(() ->
                System.out.println("stream : "+numbers.stream()
                        .filter(e -> e%2 ==0)
                        .mapToInt(FunctionComposition :: compute)
                        .sum()));

        Timeit.code(() ->
                System.out.println("parallel-stream : "+numbers.parallelStream()
                        .filter(e -> e%2 ==0)
                        .mapToInt(FunctionComposition :: compute)
                        .sum()));

        /*numbers.stream()
                    .sorted().forEach(System.out :: println);*/
    }
    public static int compute(int number){
        try{
            Thread.sleep(1000);
        }catch (Exception e){ }
        return number * 2;
    }
}
