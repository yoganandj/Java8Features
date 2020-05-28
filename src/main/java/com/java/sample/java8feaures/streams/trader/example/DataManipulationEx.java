package com.java.sample.java8feaures.streams.trader.example;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

public class DataManipulationEx {

    public static void main(String s[]){
        List<Transaction> transactions = Transaction.getTransactions();

       /* 1. Find all transactions in 2011 and sort by value (small to high)*/
        System.out.println("-----------1. Find all transactions in 2011 and sort by value (small to high)");
        List<Transaction> transactions1 = transactions.stream()
                .filter(t ->t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue)).collect(Collectors.toList());
        transactions1.stream().forEach(t -> System.out.println(t));

        /* 2. What are all the unique cities where the traders work*/
        System.out.println("-----------2. What are all the unique cities where the traders work");
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList()).forEach(System.out :: println);

        /*3. Find all traders from Cambridge and sort them by name*/
        System.out.println("-----------3. Find all traders from Cambridge and sort them by name");
        transactions.stream()
                .map( t -> t.getTrader())
                .filter( t -> t.getCity().equalsIgnoreCase("Cambridge" ))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList()).forEach(System.out :: println);

       /* 4. Return a string of all traders’ names sorted alphabetically*/
        System.out.println("-----------4. Return a string of all traders’ names sorted alphabetically");
        String traders = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a,b) -> a+b);
        System.out.println("traders : "+traders);

        //new way to do this
        String traders1 = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(", "));
        System.out.println("traders1 : "+traders1);

        /*5. Are any traders based in Milan? */
        System.out.println("-----------5. Are any traders based in Milan");
        boolean milanBased = transactions.stream()
                .anyMatch( t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println("milanBased "+milanBased);

        /*6. Print all transactions’ values from the traders living in Cambridge */
        System.out.println("-----------6. Print all transactions’ values from the traders living in Cambridge");
        transactions.stream()
                .filter( t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map( t -> t.getValue())
                .forEach(System.out :: println);

        /*7. What’s the highest value of all the transactions?*/
        System.out.println("-----------7. What’s the highest value of all the transactions?");
        int max = transactions.stream()
                .map( t -> t.getValue())
                .reduce(0, (a,b) -> a > b ? a : b );
        System.out.println("max "+max);

        /*8. Find the transaction with the smallest value */
        System.out.println("-----------8. Find the transaction with the smallest value");
        Optional<Transaction> transaction = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println("transaction with min value "+transaction.get());

        // or other way

        Optional<Transaction> transaction1 = transactions.stream()
                .min(comparing(Transaction::getValue));
        System.out.println("transaction with min value1 "+transaction.get());

    }
}
