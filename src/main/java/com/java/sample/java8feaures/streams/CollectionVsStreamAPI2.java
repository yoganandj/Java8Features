package com.java.sample.java8feaures.streams;

/*
1. A collection is an in-memory data structure that holds all the values
2. We can add things to, and remove them from, the collection

3. By contrast, a stream is a conceptually fixed data structure (you can’t add or remove elements
from it) whose elements are computed on demand

4. stream is like a lazily constructed
collection: values are computed when they’re solicited by a consumer
5. A collection is eagerly constructed (supplier-driven: fill your warehouse before you
start selling, like a Christmas novelty that has a limited life).

Example :

6. A collection in Java8 is like a movie stored on DVD.
A Stream in Java8 is like a movie streamed over the internet.

7. Collection -  Eager construction means waiting for computation of ALL values
Stream - Lazy construction means values are computed as needed.

8. Collection - Like DVD a collection holds all the values that data structure currentl has
- every element in the collection has to be computed before it can be added to collection.
Stream - Like a Streaming Video values are computed as they are needed.

--------------------------------------------------------

9. Traversable only once

similarly to iterators, a stream can be traversed only once. After that a stream is said
to be consumed. You can get a new stream from the initial data source to traverse it again just
like for an iterator

10. Using the Collection interface requires iteration to be done by the user (for example, using
for-each); this is called external iteration.
The Streams library by contrast uses internal
iteration—it does the iteration for you and takes care of storing the resulting stream value
somewhere; you merely provide a function saying what’s to be done



*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionVsStreamAPI2 {

    public static void main(String s[]){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));


        Iterator iterator = menu.iterator();

        List<String> names = new ArrayList<>();
        /*Iterating explicitly*/
        while (iterator.hasNext()){
            Dish dish = (Dish)iterator.next();
            if(dish.getCalories() > 300)
            names.add(dish.getName());
        }
        System.out.println("names : "+names);

        /*Start executing the pipeline of operations , no iteration
        * using an internal iteration,
the processing of items could be transparently done in parallel or in a different order that may
be more optimized
* These optimizations are difficult if you iterate the collection externally as
you’re used to doing in Java.
* streams—the internal iteration in the Streams library can automatically
choose a data representation and implementation of parallelism to match your hardware*/
    /*    List<String> names1 = menu.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(names1);*/

        /*You can notice several optimizations due to the lazy nature of streams. First, despite the fact
        that many dishes have more than 300 calories, only the first three are selected! This is because
        of the limit operation and a technique called short-circuiting,   */
        List<String> names1 = menu.stream()
                .filter(dish ->{
                    System.out.println("filtering : "+dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping : "+dish.getName());
                    return  dish.getName();
                })
              //  .limit(3)
                .collect(Collectors.toList());
        System.out.println(names1);

    }
}
