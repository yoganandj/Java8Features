package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

/*
1. An interface is still a functional interface if it has many default methods as long as it
   specifies only one abstract method.
2. Lambda expressions let you provide the implementation of the abstract method of a functional interface
   directly inline and treat the whole expression as an instance of a functional interface
   (more technically speaking, an instance of a concrete implementation of the functional interface)
*/


public interface ApplePredicate {

    boolean test(Apple apple);
}
