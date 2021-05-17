package com.java11u.starter.lambdaexpresseions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFunction {
    public static void main(String s[]){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        Comparator<Animal> comparatorAnimals = ( a1,  a2) -> a1.getSpecies().compareTo(a2.getSpecies());

        Collections.sort(animals, comparatorAnimals);
        animals.forEach(a -> System.out.println(a.getSpecies()));

    }
}
