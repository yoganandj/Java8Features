package com.java.sample.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SelectorPredicateEx {

    interface Selector {
        boolean pick(int value);
    }

    class EvenSelector implements Selector {

        @Override
        public boolean pick(int value) {
            return value%2 ==0;
        }
    }

    public static int totalValues(List<Integer> values, Predicate<Integer> selector){
       return values.stream()
                .filter(selector)
                .reduce(0,Math::addExact);
    }

    public static void main(String s[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
        System.out.println(totalValues(numbers,e -> true));
        System.out.println(totalValues(numbers,e -> e%2 == 0));
    }
}
