package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

public class CascadeMethodPattern {
    public static void main(String[] args) {
        Mailer1 mailer = new Mailer1();
        mailer.from("yoga@gmail.com");
        mailer.to("mymail@gamil.com");
        mailer.subject("Your code sucks");
        mailer.body("....here you go.....");
        mailer.send();
    }
}

class Mailer1{
    public static void print(String msg) {
        System.out.println(msg);
    }
    public void from(String add) { print("from");}
    public void to(String add) { print("to");}
    public void subject(String line) { print("subject");}
    public void body(String msg) { print("body");}
    public void send() { System.out.println("sending....");}
}
