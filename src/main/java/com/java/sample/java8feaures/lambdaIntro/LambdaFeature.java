package com.java.sample.java8feaures.lambdaIntro;

/*
1. An interface is still a functional interface if it has many default methods as long as it
        specifies only one abstract method.

2. You can use a lambda expression in the context of a
functional interface. In the code shown here, you can pass a lambda as second argument to the
method filter because it expects a Predicate<T>, which is a functional interface

the interface Predicate<T> so you could parameterize the
behavior of the filter method. It’s a functional interface! Why? Because Predicate specifies only
one abstract method:
 */

import com.java.sample.java8feaures.Apple;

import java.util.ArrayList;
import java.util.List;

/*
1. An interface is still a functional interface if it has many default methods as long as it
        specifies only one abstract method.
2. Lambda expressions let you provide the
implementation of the abstract method of a functional interface directly inline and treat the
whole expression as an instance of a functional interface (more technically speaking, an
instance of a concrete implementation of the functional interface).
3. We can achieve the same
thing with an anonymous inner class
4. The signature of the abstract method of the functional interface essentially describes the
signature of the lambda expression
5. We call this abstract method a function descriptor
6. @FunctionalInterface annotation
isn’t mandatory, but it’s good practice to use it when an interface is designed for that purpose
        */

public class LambdaFeature {

    public static void main(String s[]){

        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Green",123d));
        list.add(new Apple("Green",100d));
        list.add(new Apple("Red",120d));
        list.add(new Apple("Green",120d));
        list.add(new Apple("Red",90d));
        list.add(new Apple("Green",90d));

        list.sort((a1,a2) -> a1.getWeight().compareTo(a2.getWeight()));

        System.out.println("list "+list);

    }


}
