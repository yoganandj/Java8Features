package com.java11u.starter.access.modifiers.pond.duck;

public class FatherDuck {
    private String noise = "quack";
    private void quack() {
        System.out.println(noise);
    }
    private void makeNoise() {
        quack();
    }
}
