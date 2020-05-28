package com.java.sample.java8feaures.streams;

/*
1. Streams lets you manipulate collections of data in a
        declarative way (you express a query rather than code an ad hoc implementation for it).

2. collections are data structures, they’re mostly about storing
and accessing elements with specific time/space complexities (for example, an ArrayList vs. a
LinkedList). But streams are about expressing computations such as filter, sorted, and map that
you saw earlier.

3. Collections are about data; streams are about computations

4. Streams consume from a data-providing source such as collections, arrays, or I/O resources.

5. Stream operations can be executed either sequentially or in parallel.

6. Stream Pipelining :  enables certain optimizations such as laziness, short circuiting

7. Will use Internal Iteration for data processing

*/


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

    public static void main(String s[]) {

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


/*
1. The data source is the list of dishes (the menu) and it provides a sequence of elements to
the stream
2. Next, you apply a series of data processing operations on the stream: filter, map,
limit, and collect.
All these operations except collect return another stream so they can be
connected to form a pipeline, which can be viewed as a query on the source.
Finally, the collect
operation starts processing the pipeline to return a result (it’s different because it returns
something other than a stream—here, a List).
No result is produced, and indeed no element
from menu is even selected, until collect is invoked
 */
        List<String> names = menu.stream()
                .filter(d -> d.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(d -> d.getName())
                .collect(Collectors.toList());

        System.out.println("names : "+names);
    }

}
