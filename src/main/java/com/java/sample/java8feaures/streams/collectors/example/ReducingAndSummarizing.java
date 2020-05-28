package com.java.sample.java8feaures.streams.collectors.example;

import com.java.sample.java8feaures.Java8Util;
import com.java.sample.java8feaures.streams.Dish;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingAndSummarizing {
    public static void main(String s[]){
        List<Dish> menu = Java8Util.getMenu();

        // Reducing
        /* count the number of dishes in the menu, using the collector
        returned by the counting factory method */
        long count = menu.stream()
                .collect(Collectors.counting());
        System.out.println("No of Dishnes : "+count);

        /* to find the highest-calorie dish in the menu */

        Comparator<Dish> comparator = Comparator.comparing(Dish :: getCalories);

        Optional<Dish> highestCalorie = menu.stream()
                .collect(Collectors.maxBy(comparator));
        System.out.println("Highest Calorie Dish in menu : "+highestCalorie.get());

        Optional<Dish> lowestCalorie = menu.stream()
                .collect(Collectors.minBy(comparator));
        System.out.println("Lowest Calorie Dish in menu : "+lowestCalorie.get());

        // Summarization
        /* find the total number of calories in your menu list */
        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("Total Calories in menu : "+totalCalories);

        IntSummaryStatistics summaryStatistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("Total Calories in menu : "+summaryStatistics);

        /* The collector returned by the joining factory method concatenates into a single string all strings
           resulting from invoking the toString method on each object in the stream
           joining internally makes use of a StringBuilder to append the generated strings into one
         */

        String shortMenu = menu.stream()
                .map(Dish :: getName)
                .collect(Collectors.joining());
        System.out.println("shortMenu : "+shortMenu);

        String shortMenu1 = menu.stream()
                .map(Dish :: getName)
                .collect(Collectors.joining(", "));
        System.out.println("shortMenu : "+shortMenu1);

       /* Generalized summarization with reduction */

        int totalCalorie2 = menu.stream().collect(Collectors.reducing(0,Dish::getCalories, (i,j) -> i+j));
        System.out.println("totalCalorie2 : "+totalCalorie2);

        Optional<Dish> highestCalorie2 = menu.stream().collect(Collectors.reducing((d1,d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println("Highest Calorie2 Dish in menu : "+highestCalorie2.get());

        Optional<Dish> lowestCalorie2 = menu.stream().collect(Collectors.reducing((d1,d2) -> d1.getCalories() < d2.getCalories() ? d1 : d2));
        System.out.println("Highest Calorie2 Dish in menu : "+lowestCalorie2.get());

        //Different ways to achieve the above ones

        int totalCalorie3 = menu.stream().collect(Collectors.reducing(0,Dish::getCalories, Integer :: sum));
        System.out.println("totalCalorie3 : "+totalCalorie3);

        /*int highestCalorie3 = menu.stream().collect(Collectors.reducing(0,Dish::getCalories, Integer :: max));
        System.out.println("highestCalorie3 : "+highestCalorie3);

        int lowestCalorie3 = menu.stream().collect(Collectors.reducing(Dish::getCalories, Integer :: min));
        System.out.println("lowestCalorie3 : "+lowestCalorie3);*/
    }
}
