package com.java.sample.java8feaures;

public class Apple {

    private String color;
    private Double weight;

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static boolean isGreenApple(Apple apple){
        return apple.getColor().equalsIgnoreCase("Green");
    }
    public static boolean isWeight120Apple(Apple apple){
        return apple.getWeight()>=120;
    }
}
