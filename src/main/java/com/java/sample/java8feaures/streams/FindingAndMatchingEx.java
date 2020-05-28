package com.java.sample.java8feaures.streams;

import java.util.*;

import static java.util.stream.Collectors.*;

/*
These three operations, anyMatch, allMatch, and noneMatch, make use of what we call
        short-circuiting, a stream version of the familiar Java short-circuiting && and || operators.
The anyMatch, allMatch, noneMatch method returns a boolean and is therefore a terminal operation.

certain operations such as allMatch, noneMatch, findFirst, and findAny
don’t need to process the whole stream to produce a result.

because they can turn an infinite stream into a stream of finite size.
*/

public class FindingAndMatchingEx {

    public static void main(String s[]){
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

        if(menu.stream().anyMatch(Dish :: isVegetarian)){
            System.out.println("The menu is somewhat vegetarian friendly");
        }

        boolean isHealthy = menu.stream().allMatch( e -> e.getCalories() <1000);

        System.out.println("isHeathy : "+isHealthy);

        boolean isHealthy1 = menu.stream().noneMatch(e -> e.getCalories() >=1000);

        System.out.println("isHeathy1 : "+isHealthy1);

        /// Findany etc ..

        /*The answer is parallelism. Finding
        the first element is more constraining in parallel. If you don’t care about which element is
        returned, use findAny because it’s less constraining when using parallel streams*/

        menu.stream()
                .filter(dish -> dish.isVegetarian())
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().map(n -> n*n)
                .filter(n -> n%3==0)
                .findFirst().ifPresent(n -> System.out.println(n));

        Map<Type,List<Dish>> map =  menu.stream().collect(groupingBy(Dish :: getType));

        System.out.println(map);

        Map<Type, Long> map2 = menu.stream().collect(groupingBy(Dish::getType,counting()));
        System.out.println(map2);

        Map<Type, Optional<Dish>> maxMap = menu.stream().collect(groupingBy(Dish::getType,maxBy(Comparator.comparingInt(Dish :: getCalories))));

        System.out.println(maxMap);

        int sum = menu.stream().collect(summingInt(Dish::getCalories));

        System.out.println(sum);

        int sum2 = menu.stream().collect(reducing(0,Dish::getCalories,(i,j) -> i+j));

        System.out.println(sum2);

        int sum3 = menu.stream().collect(reducing(0,Dish::getCalories,Integer:: sum));

        System.out.println(sum3);
    }
}
