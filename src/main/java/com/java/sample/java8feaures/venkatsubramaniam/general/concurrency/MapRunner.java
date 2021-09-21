package com.java.sample.java8feaures.venkatsubramaniam.general.concurrency;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "Yoganand";
        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char character: characters){
            Integer count = occurances.get(character);
            if(count == null){
                occurances.put(character,1);
            }else{
                occurances.put(character,count+1);
            }
        }

        System.out.println(occurances);

    }
}
