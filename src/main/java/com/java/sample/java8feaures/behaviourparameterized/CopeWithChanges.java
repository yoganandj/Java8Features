package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

import java.util.ArrayList;
import java.util.List;

/*Need a better way than adding lots of parameters to cope with changing requirements*/

public class CopeWithChanges {

    public static List<Apple> filterAppleByColor(List<Apple> apples, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getColor().equalsIgnoreCase(color))
                result.add(apple);
        }
        return result;
    }

    public static List<Apple> filterAppleByWeigh(List<Apple> apples, Double weigh){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getWeight() >= weigh)
                result.add(apple);
        }
        return result;
    }

    public static List<Apple> filterAppleByColorAndWeigh(List<Apple> apples, boolean flag,  String color,Double weigh){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getColor().equalsIgnoreCase(color) && (!flag && apple.getWeight() >= weigh))
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

        System.out.println("result : "+filterAppleByColor(list,"Green"));

        System.out.println("result : "+filterAppleByWeigh(list,120d));

       /* 1. This solution is extremely bad. First, the client code looks terrible. What do true and false mean?
                In addition, this solution doesn’t cope well with changing requirements.
          2. need a better way than adding lots of parameters to cope with changing requirements*/

        System.out.println("result : "+filterAppleByColorAndWeigh(list,false,"green",120d));

        
    }
}
