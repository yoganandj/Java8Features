package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

import java.util.function.Consumer;

public class CascadeMethodUsingLambdaExpression {
    public static void main(String[] args) {
        Mailer.send(mailer ->
          mailer

        .from("yoga@gmail.com")
        .to("mymail@gamil.com")
        .subject("Your code sucks")
        .body("....here you go....."));

    }
}

class Mailer{
    public static void print(String msg) {
        System.out.println(msg);
    }
    public Mailer from(String add) { print("from"); return this;}
    public Mailer to(String add) { print("to"); return this;}
    public Mailer subject(String line) { print("subject"); return this;}
    public Mailer body(String msg) { print("body"); return this;}
    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("sending....");
    }
}
