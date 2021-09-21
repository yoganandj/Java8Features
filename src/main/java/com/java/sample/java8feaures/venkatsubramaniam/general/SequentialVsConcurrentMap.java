package com.java.sample.java8feaures.venkatsubramaniam.general;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SequentialVsConcurrentMap {

    public static final String MOVIE = "INCEPTION";
    public static final int VIEWS = 100_000;

    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        Map<String, BigDecimal> movieViews = new ConcurrentHashMap<>();
        movieViews.put(MOVIE, BigDecimal.ZERO);

        System.out.println(movieViews);

//        sequentialAdd(movieViews);
        concurrentAdd(movieViews);

        executorService.shutdown();

        try {
            while (!executorService.awaitTermination(1, TimeUnit.SECONDS));
            System.out.println("movie : "+movieViews);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private static void concurrentAdd(Map<String, BigDecimal> movieViews) {
        for (int i=1; i <=VIEWS; i++){
            executorService.submit(() -> addOneView(movieViews));
        }
    }

    private static void sequentialAdd(Map<String, BigDecimal> movieViews) {
        for (int i=1; i <=VIEWS; i++){
            addOneView(movieViews);
        }
    }

    private static void addOneView(Map<String, BigDecimal> movieViews) {
/*        BigDecimal views = movieViews.get(MOVIE);
        if(views !=null){
            movieViews.put(MOVIE, views.add(BigDecimal.ONE));
        }*/


        // VERSBOSE

/*        while (true){
            BigDecimal views = movieViews.get(MOVIE);
            if(views!=null){
                if(movieViews.replace(MOVIE, views, views.add(BigDecimal.ONE))){
                    break;
                }
            }
        }*/

        movieViews.computeIfPresent(MOVIE, (movie ,views) -> views.add(BigDecimal.ONE));
    }
}
