package com.java11u.starter.lambdaexpresseions;

import java.util.function.Supplier;

public class SupplierFunction {
    public static void main(String s[]){
        Supplier<Integer> supplier = () -> 42;
        System.out.println(returnNumber(supplier));
    }

    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
