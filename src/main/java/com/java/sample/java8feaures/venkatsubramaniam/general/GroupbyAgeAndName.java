package com.java.sample.java8feaures.venkatsubramaniam.general;

import com.java.sample.java8feaures.venkatsubramaniam.streams.util.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupbyAgeAndName {
    public static void main(String[] args) {
        List<Person> people = Person.createPeople();

        System.out.println(people.stream()
                                    .collect(Collectors.groupingBy(Person::getAge, Collectors.counting())));

        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(e -> e.getName(), Collectors.toList()))));

        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.groupingBy(Person ::getName, Collectors.mapping(e-> e.getAge(), Collectors.toList())))));

        /*Map<Integer, people.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.groupingBy(Person ::getName)));*/
    }
}
