package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
