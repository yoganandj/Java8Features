package com.java11u.starter;

import java.util.Arrays;
import java.util.List;

public class ListDataManipulation {
    public static void main(String s[]){

        String[] primaryColors = { "red", "blue", "yellow"};
        String[] secondaryColors = { "green", "orange", "purple"};

        System.out.println("Manipulating Array Data using a List "+ ", backed by array");

//        Arrays.asList return a List backed by array
        List<String> colorList = Arrays.asList(primaryColors);
        System.out.println("colorList = "+ colorList);

        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("colorList after sort = "+ colorList);

        System.out.println("primary colors = "+ Arrays.toString(primaryColors));

        colorList.set(0, "cyan");
        System.out.println("After setting  - primary colors = "+ Arrays.toString(primaryColors));

        colorList.replaceAll( c -> c +"ish");
        System.out.println("colorList after replace = "+ colorList);
        System.out.println("primary colors after replace= "+ Arrays.toString(primaryColors));

        colorList.set(0, "blueish");
//        primaryColors[0] = "blueish";
        System.out.println("---------colorList after array changed -----------");
        System.out.println("List colors = "+ colorList);
        System.out.println("primary colors = "+ Arrays.toString(primaryColors));

        System.out.println("---------List.of and List.CopyOf examples-----------");

        // can take array and make it a immutable List
        List<String> secondColorList = List.of(primaryColors);

        List<String> thirdColorList = List.copyOf(Arrays.asList(primaryColors));

//        colorList.set(0, "cyanish"); or
        primaryColors[0] = "blue";

        System.out.println("secondarylist - colors = "+ secondColorList);
        System.out.println("thirdlist -  colors = "+ thirdColorList);

        System.out.println("List colors = "+ colorList);
        System.out.println("primary colors = "+ Arrays.toString(primaryColors));

        try{
            secondColorList.set(0, "secondcolor");
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            thirdColorList.set(0, "thirdcolor");
        }catch (Exception e){
            e.printStackTrace();
        }





    }
}
