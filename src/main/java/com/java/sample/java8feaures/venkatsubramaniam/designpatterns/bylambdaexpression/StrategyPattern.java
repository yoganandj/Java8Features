package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {

    public static int totalValues(List<Integer> values){
        int result =0;

        for (Integer e : values){
            result += e;
        }

        return result;
    }

    public static int totalEvenValues(List<Integer> values){
        int result =0;

        for (Integer e : values){
            if(e%2 ==0)
            result += e;
        }

        return result;
    }

    public static int totalOddValues(List<Integer> values){
        int result =0;

        for (Integer e : values){
            if(e%2 != 0)
                result += e;
        }

        return result;
    }


    public static int totalValues(List<Integer> values, Predicate<Integer> selector){

        int result =0;

        for (Integer e : values){
            if(selector.test(e))
            result += e;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //total values
        System.out.println(totalValues(numbers));

        //even total values
        System.out.println(totalEvenValues(numbers));

        //odd total values
        System.out.println(totalOddValues(numbers));

        // still now we duplicated code

        //normal function

        System.out.println();
        // higher-order function

        System.out.println(totalValues(numbers, StrategyPattern::isEven));
        System.out.println(totalValues(numbers, e -> e%2 == 0));
        System.out.println(totalValues(numbers, e -> e%2 != 0));


    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}
