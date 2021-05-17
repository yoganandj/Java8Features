package com.java11u.starter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraySearch {

    public static void  main(String s[]){
        String[] firstString = {"abc", "def", "ghi", "jkl", "mno","pqr", "stu", "vwx", "yz"};
        String[] firstStringUnsortedDuplicates = {"jkl", "mno","pqr", "stu", "vwx", "yz", "jkl", "abc", "def", "ghi"};
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno" };

        List firstList = List.of(firstString);
        List secondList = Arrays.asList(firstStringUnsortedDuplicates);

        System.out.println("<--------------Arrays BinarySearch-------------------->");
        // binary search on array, look for "jks" which is in array
        String searchString = "jkl";
        System.out.println("Arrays.binarySearch(firstString, \"jkl\") ="+ Arrays.binarySearch(firstString, searchString));

        // binary search on array, look for "aaa" which is not in array
        System.out.println("Arrays.binarySearch(firstString, \"aaa\") ="+ Arrays.binarySearch(firstString, "aaa"));

        // binary search, look for "jkl" which is not in array
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates, \"jkl\") ="+ Arrays.binarySearch(firstStringUnsortedDuplicates, "jkl"));

        // binary search, look for "abc" which is not in array
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates, \"abc\") ="+ Arrays.binarySearch(firstStringUnsortedDuplicates, "abc"));

        System.out.println("<----------- Array Mismatch -------------->");
        System.out.println("Arrays.mismatch(firstString, partialFirstString) = "+Arrays.mismatch(firstString, partialFirstString));

        System.out.println("Arrays.mismatch(firstStringUnsortedDuplicates, new String[] {\"jkl\",\"mno\"}) = "+Arrays.mismatch(firstStringUnsortedDuplicates, new String[] {"jkl","mno"}));

        System.out.println("<----------- List Methods -------------->");
        System.out.println("firstList.contains(\"def\") = "+firstList.contains("def"));

        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) = "+firstList.containsAll(Arrays.asList(partialFirstString)));

        String[] unsortedList = {"jkl", "def", "abc", "ghi", "mno" };
        System.out.println("firstList.contains(unsortedList) = "+firstList.containsAll(Arrays.asList(unsortedList)));
    }
}
