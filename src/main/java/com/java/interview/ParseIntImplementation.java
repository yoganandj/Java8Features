package com.java.interview;

import java.util.Arrays;

class ParseInteger {
    String input;

    public static Integer parseInt(String input){
        String regex = "[0-9]";
        String data = "23343453";
        System.out.println(data.matches(regex));
        if(!input.matches(regex)){

            Arrays.stream(input.split("")).forEach(System.out :: println);
            return new Integer(input);

        }
      return 0;
    }
}

public class ParseIntImplementation {

    public static void main(String s[]){
        try {
            Integer a = Integer.parseInt("1");
            ParseInteger.parseInt("123");

        }catch (Exception e){
            System.out.println("Exception parsing int : "+e);
        }


    }
}
