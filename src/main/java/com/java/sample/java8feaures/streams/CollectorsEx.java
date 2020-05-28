package com.java.sample.java8feaures.streams;

/*
1. The following example clearly shows one of the main advantages of functional-style
        programming over an imperative approach: we just have to formulate the result we want to
        obtain the “what” and not the steps we need to perform to obtain it—the “how.”
2. Collectors as advanced reductions
3. More specifically, invoking the collect method on a stream triggers a reduction
operation (parameterized by a Collector) on the elements of the stream itself.
4. The implementation of the methods of the Collector interface defines how to perform a
reduction operation on a stream
5. The factory methods (such as groupingBy) provided by the Collectors class.
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CollectorsEx {

    public static List<Transaction> transactions = Arrays.asList( new Transaction(Currency.EUR, 1500.0),
            new Transaction(Currency.USD, 2300.0),
            new Transaction(Currency.GBP, 9900.0),
            new Transaction(Currency.EUR, 1100.0),
            new Transaction(Currency.JPY, 7800.0),
            new Transaction(Currency.CHF, 6700.0),
            new Transaction(Currency.EUR, 5600.0),
            new Transaction(Currency.USD, 4500.0),
            new Transaction(Currency.CHF, 3400.0),
            new Transaction(Currency.GBP, 3200.0),
            new Transaction(Currency.USD, 4600.0),
            new Transaction(Currency.JPY, 5700.0),
            new Transaction(Currency.EUR, 6800.0) );

    public static void main(String s[]){

        /* Group a list of transactions by currency to obtain the sum of the values of all transactions with that
        currency (returning a Map<Currency, Integer>) */

        Map<Currency,List<Transaction>> currencyTransactionMap = new HashMap<>();
        
        for(Currency currency : Currency.values()){
            List<Transaction> transactionsList = transactions.stream().filter(transaction -> transaction.getCurrency().equals(currency)).collect(Collectors.toList());
            currencyTransactionMap.put(currency,transactionsList);
        }
        System.out.println(currencyTransactionMap);

        // sum of all values

        Map<Currency,Double> currencyTransactionMap2 = new HashMap<>();

        for(Currency currency : Currency.values()){
            Double sum = transactions.stream()
                    .filter(transaction -> transaction.getCurrency().equals(currency))
                    .map(t -> t.getValue())
                    .reduce(0d,Double :: sum);

            currencyTransactionMap2.put(currency,sum);
        }
        System.out.println(currencyTransactionMap2);

        /* Achieving the same result by using a more general Collector parameter to the collect
        method on Stream rather than the toList */

        Map<Currency, List<Transaction>> map = transactions.stream()
                                                .collect(groupingBy(Transaction::getCurrency));

        System.out.println(map);

       /* The above example clearly shows one of the main advantages of functional-style
        programming over an imperative approach: we just have to formulate the result we want to
        obtain the “what” and not the steps we need to perform to obtain it—the “how.”*/

        /*Map<Currency, Double> map2 = transactions.stream()
                .map( t -> t.getValue())
                .collect(groupingBy(Transaction::getCurrency));

        System.out.println(map2);*/






    }

    public static class Transaction {
        private final Currency currency;
        private final double value;

        public Transaction(Currency currency, double value) {
            this.currency = currency;
            this.value = value;
        }

        public Currency getCurrency() {
            return currency;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return currency + " " + value;
        }
    }

    public enum Currency {
        EUR, USD, JPY, GBP, CHF
    }
}

