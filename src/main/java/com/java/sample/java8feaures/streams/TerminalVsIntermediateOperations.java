package com.java.sample.java8feaures.streams;

import java.util.Arrays;
import java.util.List;

/*
1. Intermediate operations such as filter and map return a stream and can be chained together. They’re
        used to set up a pipeline of operations but don’t produce any result.
2. Terminal operations such as forEach and count return a nonstream value and process a stream
        pipeline to return a result.
*/

public class TerminalVsIntermediateOperations {

    public static void main(String s[]) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));

       /* Terminal operations produce a result from a stream pipeline. A result is any nonstream value
        such as a List, an Integer, or even void*/

        menu.stream().forEach(System.out :: println);


        long count = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .distinct()
                .limit(3)
                .count();
        System.out.println(count);



    }


}
