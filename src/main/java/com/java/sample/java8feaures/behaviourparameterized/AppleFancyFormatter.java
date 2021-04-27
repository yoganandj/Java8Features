package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 100 ? "heavy" : "light";
        return "A " +characteristic+ " "+apple.getColor()+ " apple" ;
    }
}
