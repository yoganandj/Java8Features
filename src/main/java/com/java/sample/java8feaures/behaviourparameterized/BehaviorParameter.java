package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

import java.util.ArrayList;
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

        System.out.println("result : "+filterApple(list,new AppleGreenColorPredicate()));

        System.out.println("result : "+filterApple(list,new AppleHeavyWeightPredicate()));
    }

}
