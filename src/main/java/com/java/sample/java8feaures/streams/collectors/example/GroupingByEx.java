package com.java.sample.java8feaures.streams.collectors.example;

import com.java.sample.java8feaures.Java8Util;
import com.java.sample.java8feaures.streams.CaloricLevel;
import com.java.sample.java8feaures.streams.Dish;
import com.java.sample.java8feaures.streams.Type;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String s[]){
        List<Dish> menu =  Java8Util.getMenu();

        /*
        We call this
        Function a classification function because it’s used to classify the elements of the stream into
        different groups

        The result of this grouping operation, shown in figure 6.4, is a Map having as
        map key the value returned by the classification function and as corresponding map value a list
        of all the items in the stream having that classified value*/

        Map<Type, List<Dish>> menuByType = menu.stream().collect(Collectors.groupingBy(Dish :: getType));
        System.out.println("menuByType : "+menuByType);

        /*But it isn’t always possible to use a method reference as a classification function, because you
        may wish to classify using something more complex (ex : CaloricLevel) than a simple property accessor. */
        Map<CaloricLevel,List<Dish>> menuByCaloricLevel=  menu.stream()
                .collect(
                        Collectors.groupingBy(dish -> {
                            if(dish.getCalories() <=400) return CaloricLevel.DIET;
                            else if(dish.getCalories() <=700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                );
        System.out.println("menuByCaloricLevel : "+menuByCaloricLevel);

        // MultiGrouping

        /*This multilevel grouping operation can be
        extended to any number of levels, and an n-level grouping has as a result an n-level Map
        modeling an n-level tree structure. */
        
        Map<Type,Map<CaloricLevel, List<Dish>>> mapByMultiGroup = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.groupingBy(dish -> {
                            if(dish.getCalories() <=400) return CaloricLevel.DIET;
                            else if(dish.getCalories() <=700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                        ));
        System.out.println("mapByMultiGroup : "+mapByMultiGroup);


        /*But more generally, the second collector passed to
        the first groupingBy can be any type of collector, not just another groupingBy*/

       Map<Type, Long> countByType =  menu.stream()
                .collect(Collectors.groupingBy(Dish::getType ,Collectors.counting()));
       System.out.println("countByType : "+countByType);


       Optional<Dish> dish = menu.stream()
               .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
       Map<Type,Optional<Dish>> highestDishByType = menu.stream()
               .collect(Collectors.groupingBy(Dish::getType,
                       Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
       System.out.println("highestDishByType : "+highestDishByType);
       Map<Type,Dish> highestDishByType2 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),Optional::get)));
       System.out.println("highestDishByType2 : "+highestDishByType2);

        Map<Type, Set<Dish>> menuByTypeSet = menu.stream()
                .collect(Collectors.groupingBy(Dish :: getType,Collectors.mapping(d-> d,Collectors.toCollection(HashSet::new))));
        System.out.println("menuByTypeSet : "+menuByTypeSet);
    }

}
