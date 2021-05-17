package com.java11u.starter.lambdaexpresseions;

public class CheckIfSwimmer implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
