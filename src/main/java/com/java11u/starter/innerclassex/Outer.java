package com.java11u.starter.innerclassex;

/*  1. Can be declared public, protected, package‐private (default), or private
    2. Can extend any class and implement interfaces
    3. Can be marked abstract or final
    4. Cannot declare static fields or methods, except for static final fields
    5. Can access members of the outer class including private members*/

public class Outer {
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;
        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
    }
}
