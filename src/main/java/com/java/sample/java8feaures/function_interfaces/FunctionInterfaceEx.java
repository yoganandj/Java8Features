package com.java.sample.java8feaures.function_interfaces;


/*
1. An interface is still a functional interface if it has many default methods as long as it
   specifies only one abstract method.
2. Lambda expressions let you provide the implementation of the abstract method of a functional interface
   directly inline and treat the whole expression as an instance of a functional interface
   (more technically speaking, an instance of a concrete implementation of the functional interface)
3. The signature of the abstract method of the functional interface essentially describes the
   signature of the lambda expression. We call this abstract method a function descriptor
4. For example, the Runnable interface can be viewed as the signature of a function that accepts
   nothing and returns nothing (void) because it has only one abstract method called run, which
   accepts nothing and returns nothing (void).
5. It suffices to understand that a lambda expression can be assigned to a variable or passed to a method
   expecting a functional interface as argument, provided the lambda expression has the same signature
   as the abstract method of the functional interface
*/


public class FunctionInterfaceEx {



    public static void process(Runnable r){
        Thread th = new Thread(r);
        th.start();
    }

    public static void main(String s[]){
        Runnable r1 = () -> System.out.println("Hello from r1");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from r2");
            }
        };


        process(r1);
        process(r2);

        process(() -> System.out.println("Hello from r3"));
    }
}
