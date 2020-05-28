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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStreamAPI {

    public static void main(String s[]){
        List<String> items = Arrays.asList("Java8","REST API","Spring Boot");

        /*for(String item: items){
            System.out.println(item);
        }*/

        /*Iterating explicitly*/
        Iterator<String> iterator = items.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream<String> streams = items.stream();

        streams.forEach(System.out :: println);

        /*The following code would throw an exception indicating the
        stream has been consumed:
        IllegalStateException : stream has already been operated upon or closed

        So keep in mind that you can consume a stream only once!
        */

        //streams.forEach(System.out :: println);

    }
}
