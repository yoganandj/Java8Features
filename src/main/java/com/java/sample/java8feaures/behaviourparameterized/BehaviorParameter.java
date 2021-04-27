package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
1. Behavior parameterization is great because it enables us to separate
        the logic of iterating the collection to filter and the behavior to apply on each element of that
        collection.
2. As a consequence, we can reuse the same method and give it different behaviors to
        achieve different things
3. Our code is more flexible because lambda expressions encourage the style of behavior
parameterization. Our code can use and execute multiple
behaviors passed as arguments to cope with requirement changes.
*/

public class BehaviorParameter {

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){

        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);

        }
    }

    public static void main(String s[]){
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Green",123d));
        list.add(new Apple("Green",100d));
        list.add(new Apple("Red",120d));
        list.add(new Apple("Green",120d));
        list.add(new Apple("Red",90d));
        list.add(new Apple("Green",90d));

        /*Parameterizing the behavior of filterApples and passing
        different filter strategies*/

//        System.out.println("result : "+filterApple(list,new AppleGreenColorPredicate()));

//        System.out.println("result : "+filterApple(list,new AppleHeavyWeightPredicate()));


//       filterApple(list, Apple :: isGreenApple).forEach(System.out :: println);

//       prettyPrintApple(list, new AppleSimpleFormatter());

//        prettyPrintApple(list, new AppleFancyFormatter());

        // Comparator without lambda

        list.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple apple1, Apple apple2) {
                return apple1.getWeight().compareTo(apple2.getWeight());
            }
        });

        System.out.println(list);

        // Comparator without lambda

        list.sort((a1,a2) -> a1.getWeight().compareTo(a2.getWeight()));

        System.out.println(list);

    }

}
