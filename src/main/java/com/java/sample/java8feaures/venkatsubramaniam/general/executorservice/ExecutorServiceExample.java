package com.java.sample.java8feaures.venkatsubramaniam.general.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new NewRunnable("Task 1"));
        executorService.execute(new NewRunnable("Task 2"));
        executorService.execute(new NewRunnable("Task 3"));

        executorService.shutdown();

    }
}

class NewRunnable implements Runnable{

    private String msg;
    public NewRunnable(String msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        String completeMsg =
                Thread.currentThread().getName() + ": "+msg;
        System.out.println(completeMsg);
    }
}
