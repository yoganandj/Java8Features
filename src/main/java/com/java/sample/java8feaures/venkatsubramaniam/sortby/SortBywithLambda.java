package com.java.sample.java8feaures.venkatsubramaniam.sortby;

import com.java.sample.java8feaures.venkatsubramaniam.streams.util.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortBywithLambda {
    public static void main(String[] args) {
        List<Person> people = Person.createPeople();

        Collections.sort(people, Comparator.comparing(Person::getName)
         .thenComparing(Comparator.comparing(Person::getAge)));

//        Collections.sort(people, (p1,p2)  -> (p1.getName().compareTo(p2.getName())));
        System.out.println(people);

        // max

        Optional<Person> oldestPerson = people.stream().max(Comparator.comparing(Person::getAge));

        System.out.println(oldestPerson.orElseThrow(() -> new IllegalArgumentException("empty person list")));


    }
}
