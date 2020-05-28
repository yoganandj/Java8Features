package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

public class AppleHeavyWeightPredicate implements  ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >=110;
    }
}
