package com.java.sample.java8feaures.venkatsubramaniam.streams;

import com.java.sample.java8feaures.venkatsubramaniam.streams.util.Gender;
import com.java.sample.java8feaures.venkatsubramaniam.streams.util.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapCollectStreamOperation {

    public static List<Person> createPeople(){
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jil", Gender.FEMALE, 12)
        );
    }
    public static void main(String[] args) {
        List<Person> people = createPeople();
        // grouping and mapping
        System.out.println(
          people.stream()
                .collect(Collectors.groupingBy(Person :: getName,
                   Collectors.mapping(Person :: getAge, Collectors.toList())))
        );
    }
}
