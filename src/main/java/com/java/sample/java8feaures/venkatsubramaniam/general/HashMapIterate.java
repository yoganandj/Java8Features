package com.java.sample.java8feaures.venkatsubramaniam.general;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterate {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Sandeep");
        map.put(2,"Srinivas");
        map.put(3,"Manoj");
        map.put(4,"Kiran");

        System.out.println(map);
        
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key :"+entry.getKey());
            System.out.println("value :"+entry.getValue());
            System.out.println("--------------------------");
        }

        map.forEach((k,v) ->System.out.println("key : "+k+" value :"+v));
    }
}
