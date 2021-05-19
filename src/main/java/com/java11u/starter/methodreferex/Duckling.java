package com.java11u.starter.methodreferex;

/* A method reference and a lambda behave the same way at runtime.
   You can pretend the compiler turns your method references into lambdas for you.*/

public class Duckling {
    public static void makeSound(String sound){
//        LearnToSpeak learner = s -> System.out.println(s);

 /* The lambda declares one parameter named s.
    However, it does nothing other than pass that parameter to another method.
    A method reference lets us remove that redundancy and instead write this:*/

        LearnToSpeak learner =System.out :: println;
        DuckHelper.teacher(sound, learner);
    }

    public static void main(String s[]){
        makeSound("Quck");
    }
}
