package com.java.sample.java8feaures.venkatsubramaniam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExternalVsInternalIterations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //1. external iterators
       /* for(int i=0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }*/

        //2.external iterators also
        /*for(int e : numbers){
            System.out.println(e);
        }*/


        //3. internal iterators
       /* numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });*/

        // 4. internal iterators using lambda expression
        numbers.forEach(i -> System.out.println(i));
        // Java 8 has type inference, finally, hold your tweets, but only for
        // lambda expressions.

        // method reference is only for if we pass to lambda with out doing any operations
    }
}
