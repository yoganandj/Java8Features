package com.java.sample.java8feaures.venkatsubramaniam.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateAndRemove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Yoga","anand"));

        System.out.println(names);

        // ConcurrentModificationException
        /*for (String name : names){
            if(Character.isLowerCase(name.charAt(0))){
                names.remove(name);
            }
        }*/

        names.remove("");

/*      // Iterator is not good to use as it is not thread safe
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name =  iterator.next();
            if(Character.isLowerCase(name.charAt(0))){
                iterator.remove();
            }
        }*/

//        names.removeIf(name -> Character.isLowerCase(name.charAt(0)));

        System.out.println(names);
    }
}
