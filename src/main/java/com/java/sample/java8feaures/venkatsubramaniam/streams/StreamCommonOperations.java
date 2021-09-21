package com.java.sample.java8feaures.venkatsubramaniam.streams;

import java.util.Arrays;
import java.util.List;

public class StreamCommonOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,9,3,1,5,8,10,6,2,7);

        System.out.println(numbers.stream()
               .filter(e -> e%2 ==0)
               .map(e  -> e * 2.0)
               .reduce(0.0, (total, e) -> total+ e));

        System.out.println(numbers.stream()
                .filter(e -> e%2 ==0)
                .mapToDouble(e  -> e * 2.0)
                .sum());

        // filter: 0<= number of elements in the output <=number of input
        // input: Stream<T> filter takes Predicate<T>  // boolean


        // map : transforms values
        // number of output  == number of input
        // no guarantee on the type of output with respect to the type of the input
        // parameter : Stream<T> map takes Function<T, R> to return Stream<R>

        // both filter and map stay within their swimlanes

        // reduce cuts across the swimlanes

        // reduce on Stream<T> takes two parameters:
        // first parameter is of type T
        // second parameter is of type BiFunction<R, T,R> to produce a result of R
    }
}
