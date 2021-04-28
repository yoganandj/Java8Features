package com.java.sample.java8feaures.method_references;

import com.java.sample.java8feaures.Apple;
import com.java.sample.java8feaures.Java8Util;

import java.util.Comparator;
import java.util.List;

public class MethodReferenceEx {
    public static void main(String s[]){
        List<Apple> inventory = Java8Util.getApples();
        System.out.println(inventory);

        // using Lambda expression to pass Comparator
       /*
        inventory.sort((a1,a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);*/

        // Using method reference and using default methods in Comparator
//        Comparator<Apple> c = Comparator.comparing(a -> a.getWeight());

        /*inventory.sort(Comparator.comparing(Apple :: getWeight).reversed());
        System.out.println(inventory);*/

        //Chaining Comparator - sort first by weight and then sort by country

        inventory.sort(Comparator.comparing(Apple :: getWeight).thenComparing(Apple :: getColor));

        System.out.println(inventory);







    }
}
