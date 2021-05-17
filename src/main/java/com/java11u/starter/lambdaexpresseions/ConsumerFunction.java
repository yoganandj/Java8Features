package com.java11u.starter.lambdaexpresseions;

import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String s[]){
        Consumer<String> consumer = x -> System.out.println(x);

        print(consumer,"HelloWord");
    }

    private static void print(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}
