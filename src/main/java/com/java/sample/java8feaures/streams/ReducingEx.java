package com.java.sample.java8feaures.streams;

/*
the terminal operations we’ve seen return a boolean - (allMatch, matchAny and noneMatch),
void - (forEach), or
an Optional object -  (findAny,findAll and findFirst).
You’ve also been using collect to combine all elements in a stream into a List

*/

import com.java.sample.java8feaures.Java8Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingEx {

    public static void main(String s[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        /*
         * @param identity the identity value for the accumulating function
         * @param accumulator an function for combining two values
         * @return the result of the reduction
          reduce(T identity, BinaryOperator<T> accumulator);
         *      T result = identity;
         *     for (T element : this stream)
         *         result = accumulator.apply(result, element)
         *     return result; */
        int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);

        /*You can make this code more concise by using a method reference*/
        sum = numbers.stream().reduce(0,Integer :: sum);
        System.out.println(sum);

        /*There’s also an overloaded variant of reduce that doesn’t take an initial value, but it returns an
        Optional object:*/
        Optional<Integer> sum1 =  numbers.stream().reduce(Integer :: sum);
        System.out.println(sum1);

        /*Maximum and minimum*/
        Optional<Integer> max = numbers.stream().reduce(Integer :: max);
        System.out.println(max.get());

        int max1 = numbers.stream().reduce(0,(a,b) -> a > b ? a : b);
        System.out.println(max1);
        int min = numbers.stream().reduce(0,(a,b) -> a < b ? a : b);
        System.out.println(min);

        List<Dish> dishes = Java8Util.getMenu();

        int count = dishes.stream().map(d -> 1).reduce(0,(a,b) -> a+b);
        System.out.println("No of dishes : "+count);

        int totalCal = dishes.stream().collect(Collectors.summingInt(Dish::getCalories));

        System.out.println("totalCal : "+totalCal);

        System.out.println(" ---------------------------------------------------- ");
        dishes.stream().sorted(Comparator.comparingInt(Dish :: getCalories)).forEach(System.out :: println);
        System.out.println(" ---------------------------------------------------- ");
        dishes.stream().sorted(Comparator.comparingInt(Dish :: getCalories).reversed()).forEach(System.out :: println);
    }
}


