package com.java.sample.java8feaures;

import com.java.sample.java8feaures.streams.Dish;
import com.java.sample.java8feaures.streams.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Util {

    public static List<Dish> getMenu() {
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
        return menu;
    }

    public static List<Apple> getApples(){
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Green",123d));
        list.add(new Apple("Green",100d));
        list.add(new Apple("Red",120d));
        list.add(new Apple("Green",120d));
        list.add(new Apple("Red",90d));
        list.add(new Apple("Green",90d));
        return list;
    }
}
