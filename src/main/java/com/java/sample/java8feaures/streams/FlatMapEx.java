package com.java.sample.java8feaures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*flatMap method lets you replace each value of a stream with another stream
        and then concatenates all the generated streams into a single stream.*/

public class FlatMapEx {

    public static void main(String s[]){
        List<String> value = Arrays.asList("hello how are you", "Do you find hello word");

        List<String> distinctWords = value.stream()
                .map(words-> words.split(" "))
                .flatMap(Arrays :: stream)
                .distinct()
                .collect(Collectors.toList());
      //System.out.println(distinctWords);

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //  numbers.stream().map(n -> n*n).collect(Collectors.toList()).stream().forEach(System.out :: println);
    List<Integer> numbers1 =Arrays.asList(1,2,3);
    List<Integer> numbers2 = Arrays.asList(3,4);

    List<int[]> pairs = numbers1.stream()
            .flatMap(i -> numbers2.stream()
                    .filter(j -> (i+j)%3 ==0)
                    .map(j -> new int[]{i,j}))
            .collect(Collectors.toList());

    Object[] ar =  pairs.toArray();

    System.out.println(Arrays.deepToString(ar));

  //  pairs.stream().map(e -> Arrays.deepToString(e))


    }
}
