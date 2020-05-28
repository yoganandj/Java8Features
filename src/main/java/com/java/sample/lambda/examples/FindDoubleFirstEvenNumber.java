package com.java.sample.lambda.examples;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindDoubleFirstEvenNumber {
    public static boolean isGreaterThan3(int number){
        System.out.println("IsGreaterThan3 : "+number);
        return number > 3;
    }


    public static boolean isEven(int number){
        System.out.println("IsEven : "+number);
        return number%2 == 0;
    }
    public static int doubleIt(int number){
        System.out.println("doubleIt : "+number);
        return number * 2;
    }
    public static void main(String s[]){
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        Predicate<Integer> isGreatherThan3 = number -> number > 3;
        Function<Integer, Predicate<Integer>> isGreatherThan = pivot ->
                number -> number > pivot;
        System.out.println(numbers.stream()
                                    .filter(isGreatherThan.apply(4))
                                    .filter(FindDoubleFirstEvenNumber::isEven)
                                    .map(FindDoubleFirstEvenNumber::doubleIt)
                                    .findFirst()
                                    .get()
        );
    }
}
