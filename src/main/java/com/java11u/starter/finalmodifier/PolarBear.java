package com.java11u.starter.finalmodifier;

/* 1. If an instance variable is marked final, then it must be assigned a value when it is
   declared or when the object is instantiated
   2.
   */

public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;

//    fishEaten variable is assigned a value in an instance initializer.

    { fishEaten = 10; }

    public PolarBear() {
        name = "Robert";
    }
    public PolarBear(int height) {
        this();
    }
}
