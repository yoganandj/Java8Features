package com.java11u.starter.collectionex;

import java.util.*;

public class ListExample {
    public static void main(String s[]){
        List<String> initialData = List.of("Anne","Barry","Charles","David","Edward");

        List<String> namesList = new ArrayList<>(initialData);
        System.out.println("-------ArrayList---------");
        System.out.println("Original values entered : "+initialData);

        CollectionTests.doStuffWithCollection(namesList, "Fred", "David", "David");

        System.out.println("------------LIst Stuff---------------");
        List<String> list = new ArrayList<>(initialData);
        System.out.println("Initial List data : "+list);
        doSimpleListStuff(list);

        System.out.println("namelist : "+namesList);
        System.out.println("------------Sub LIst Stuff---------------");
        List<String> subList = namesList.subList(1, 5);
        System.out.println("sublist : "+subList);
        System.out.println("namelist : "+namesList);
        System.out.println("------after sublist reverseOrder------");
        subList.sort(Comparator.reverseOrder());
        System.out.println("sublist : "+subList);
        System.out.println("namelist : "+namesList);

        System.out.println("------add element to  sublist view------");
        subList.add("Aryn");
        System.out.println("sublist : "+subList);
        System.out.println("namelist : "+namesList);

        System.out.println("------sort sublist view------");
        subList.sort(String :: compareTo);
        System.out.println("sublist : "+subList);
        System.out.println("namelist : "+namesList);

        System.out.println("------adding element to namelist------");
        subList.add(0,"Brad");
//        System.out.println("sublist : "+subList);
        System.out.println("namelist : "+namesList);
        System.out.println("sublist : "+subList);

    }

    private static void doSimpleListStuff(List<String> list){
        list.add(0, "Arnold");
        System.out.println("After adding Arnold at index 0 : "+list);
        System.out.println("After adding others at index 0 : "+list.addAll(0, List.of("Aaron","Able"))+" "+list);
        System.out.println("Setting name at index 2  : "+list.set(2,"Annett")+" "+list);
        System.out.println("Arnold can be found at index   : "+list.indexOf("Arnold"));
        System.out.println("Annett can be found at index   : "+list.indexOf("Annett"));

        list.add(0,"David");
        System.out.println("After adding David at index 0 : "+list);
        System.out.println("The last David can be found at index   : "+list.lastIndexOf("David"));
        list.sort(Comparator.reverseOrder());
        System.out.println("After sort : "+list);
//        list.sort(Comparator.naturalOrder());
        System.out.println("After sort : "+list);

    }
}
