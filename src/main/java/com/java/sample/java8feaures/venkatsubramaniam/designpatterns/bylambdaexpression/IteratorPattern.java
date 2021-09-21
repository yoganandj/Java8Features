package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // external iterator
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // internal iterator by lambda expression

        numbers.forEach(System.out :: println);
    }
}
