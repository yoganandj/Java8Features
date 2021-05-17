package com.java11u.starter.overloading;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string");
    }

    public void fly(Object o) {
        System.out.print("object");
    }
    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        System.out.print("-");
        r.fly(56);
        System.out.print("-");
        r.fly(78.9d);
    }
}
