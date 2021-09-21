package com.java.sample.java8feaures.venkatsubramaniam;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // method reference is only for if we pass to lambda with out doing any operations
        // method reference to instance method
//        numbers.forEach(System.out :: println);

        // method reference for two parameters
       System.out.println(numbers.stream()
              // .reduce(0,(total ,e) -> Integer.sum(total, e)));
               .reduce(0, Integer :: sum));

        System.out.println(numbers.stream()
                 .map(String :: valueOf)
                // .reduce("", (carry, str) -> carry.concat(str)));
                .reduce("", String :: concat));
    }
}
