package com.java11u.starter.enumex;

public class EnumTest {
    public static void main(String args[]){
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true
        System.out.println();

        for(Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal()+"  - "+season);
        }
    }
}
