package com.java11u.starter.lambdaexpresseions;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String s[]){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        printHopper(animals, new CheckIfHopper());
        printSwimmer(animals, new CheckIfSwimmer());
    }

    private static void printSwimmer(List<Animal> animals, CheckIfSwimmer checkIfSwimmer) {
        for(Animal animal: animals){
            if(checkIfSwimmer.test(animal)){
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
