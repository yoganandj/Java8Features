package com.java.sample.java8feaures.venkatsubramaniam;

public class Sample {
    public static void main(String[] args) throws InterruptedException {

        //functions has 4 things
        // 1. name - anonymous
            // 2. parameter list
            // 3. body
        // 4. return type  - inferred

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });

        // using lambda expression :

        Thread th1 = new Thread(() -> {
                System.out.println("In another thread2");
            });

        th.start();
        th1.start();


        th.join();
        th1.join();

        System.out.println("In main");
    }
}
