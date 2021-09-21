package com.java.sample.java8feaures.venkatsubramaniam.general;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindVowels {
    public static void main(String[] args) {
        String s = "AEROHEROINDIA";

        Map<Character, Long> vowelsCount = Arrays.stream(s.split(""))
                .map( e -> Character.toTitleCase(e.charAt(0)))
                .filter(FindVowels::isVowel)
                .collect(Collectors.groupingBy(Character ::valueOf, Collectors.counting()));
        System.out.println(vowelsCount);

        Map<Boolean, Map<Character, Long>> partitionCharacters = Arrays.stream(s.split(""))
                .map( e -> Character.toTitleCase(e.charAt(0)))

                .collect(Collectors.partitioningBy(FindVowels::isVowel,(Collectors.groupingBy(Character ::valueOf, Collectors.counting()))));

        System.out.println(partitionCharacters);
        System.out.println("Vowels : "+partitionCharacters.get(true));
        System.out.println("Consonants : "+partitionCharacters.get(false));


    }

    public static boolean isVowel(char e){
        if(e == 'A' || e == 'E' || e == 'I' || e == 'O' || e =='U'){
            return true;
        }
        return false;
    }

    public static boolean isVowel1(int e){
        if(e == 'A' || e == 'E' || e == 'I' || e == 'O' || e =='U'){
            return true;
        }
        return false;
    }
}
