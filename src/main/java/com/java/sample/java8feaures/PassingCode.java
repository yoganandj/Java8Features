package com.java.sample.java8feaures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
1. Two methods vary only in one line: the highlighted condition inside the if construct
2. Java 8 makes it possible to pass the code of the condition as an argument,
        thus avoiding code duplication of the filter method.
3. Streams API : containing a comprehensive  set of operations similar to filter
that functional programmers may be familiar with (for example, map, reduce),
along with methods to convert between Collections and Streams
4. Streams API provides a very different way to process data in comparison to the Collections API
5. To iterate through each element Collection API will use external iteration mechanism for iterating over data
6. To iterate through each element Stream API will use internal iteration mechanism for iterating over data
   as data processing happens internally inside the library.
*/

public class PassingCode {

    public static List<Apple> filterGreenApple(List<Apple> inventory){
        List<Apple> apples = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getColor().equalsIgnoreCase("Green")){
                apples.add(apple);
            }
        }
        return apples;
    }

    public static List<Apple> filterWeight120Apple(List<Apple> inventory){
        List<Apple> apples = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getWeight() >= 120){
                apples.add(apple);
            }
        }
        return apples;
    }



    public static List<Apple> filterApple(List<Apple> apples, Predicate<Apple> predicate){
        List<Apple> appleList = new ArrayList<>();
        for(Apple apple : apples){
            if(predicate.test(apple)){
                appleList.add(apple);
            }
        }
        return appleList;
    }
    public static void main(String s[]){
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Green",123d));
        list.add(new Apple("Green",150d));
        list.add(new Apple("Red",110d));
        list.add(new Apple("Green",120d));
        list.add(new Apple("Red",90d));
        list.add(new Apple("Green",90d));


        List<Apple> apples = filterGreenApple(list);

      //  System.out.println(apples);

        List<Apple> weighApples = filterWeight120Apple(list);

        //System.out.println(weighApples);


       // System.out.println("Green apples : "+filterApple(apples, Apple:: isGreenApple));

       // System.out.println("Weight >120 apples : "+filterApple(apples, Apple:: isWeight120Apple));


        // Library method for filter -  Java 8 Streams API

        System.out.println("filter : "+ list.stream().filter(Apple :: isGreenApple).collect(Collectors.toList()));

        System.out.println("filter : "+ list.stream().filter(Apple :: isWeight120Apple).collect(Collectors.toList()));



    }


}


