package com.java.sample.java8feaures.venkatsubramaniam.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        String s = "I AM AM NOT TRUE GENTLEMAN";

        String[] words = s.split(" ");

        Map<String, Integer> mapWords = new HashMap<>();

        for(String word : words){
            if(mapWords.containsKey(word)){
                mapWords.put(word, mapWords.get(word)+1);
            }else{
                mapWords.put(word, 1);
            }
        }

        System.out.println(mapWords);

        Map<String, Long> mapwords1 = Arrays.stream(words).collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(mapwords1);
    }
}
