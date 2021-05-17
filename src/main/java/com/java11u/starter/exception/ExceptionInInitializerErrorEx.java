package com.java11u.starter.exception;

/*  1. The ExceptionInInitializerError is an error because Java failed to load the whole class.
    This failure prevents Java from continuing.

    2. NoClassDefFoundError - A NoClassDefFoundError occurs when Java can’t find the class at
    runtime. Generally, this means a library available when the code was compiled is
    not available when the code is executed.

    3. StackOverflowError - When Java calls methods, it puts parameters and local variables on
    the stack. After doing this a very large number of times, the stack runs out of room and
    overflows
    */


public class ExceptionInInitializerErrorEx {
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }
    public static void main(String... args) {
        System.out.println("hello");
    }

    public void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
            System.out.println(e2);  // DOES NOT COMPILE
        }
    }
}
