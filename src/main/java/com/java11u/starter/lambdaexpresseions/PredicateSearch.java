package com.java11u.starter.lambdaexpresseions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {
    public static void main(String s[]){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
//        printSwimmer(animals, new CheckIfSwimmer());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for(Animal animal: animals){
            if(checker.test(animal)){
                System.out.print(animal+" ");
            }
        }
        System.out.println();
    }

    private static void printHopper(List<Animal> animals, CheckIfHopper checkIfHopper) {

        for(Animal animal: animals){
            if(checkIfHopper.test(animal)){
                System.out.print(animal+" ");
            }
        }
        System.out.println();
    }
}
