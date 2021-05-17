package com.java11u.starter.access.modifiers.pond.swan;

import com.java11u.starter.access.modifiers.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
//        duck.quack();                       // DOES NOT COMPILE
//        System.out.println(duck.noise);     // DOES NOT COMPILE
    }
}
