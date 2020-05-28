package com.java.sample.java8feaures.streams.collectors.example;

import com.java.sample.java8feaures.Java8Util;
import com.java.sample.java8feaures.streams.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PartitioningByEx {
    public static void main(String s[]){
        List<Dish> menu = Java8Util.getMenu();
        Map<Boolean,List<Dish>> menuByVeg = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(menuByVeg);

        Map<Boolean,Dish> highestCaloric = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))
                        ,Optional :: get)));
        System.out.println("highestCaloric :"+highestCaloric);
        // Multilevel Partitioning
        Map<Boolean, Map<Boolean, List<Dish>>> map4 = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.partitioningBy(dish -> dish.getCalories() > 500)));

        System.out.println("map4 :"+map4.get(true));
        System.out.println("map4 :"+map4.get(false));

        /* Wont compile as Dish :: getType is not predicate */

        /*menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.partitioningBy(Dish :: getType)));*/
        Map<Boolean, Long> countByVeg = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,Collectors.counting()));
        System.out.println("countByVeg :"+countByVeg);

        menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));
    }
}
