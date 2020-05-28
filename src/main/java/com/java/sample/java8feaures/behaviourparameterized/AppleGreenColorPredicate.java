package com.java.sample.java8feaures.behaviourparameterized;

import com.java.sample.java8feaures.Apple;

public class AppleGreenColorPredicate  implements  ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("Green");
    }
}
