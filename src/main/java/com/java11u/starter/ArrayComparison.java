package com.java11u.starter;

import java.util.Arrays;
import java.util.List;

public class ArrayComparison {

    public static void main(String s[]){

        String[] firstString = {"abc", "def", "ghi", "jkl", "mno","pqr", "stu", "vwx", "yz"};
        String[] copyOfFirstString = {"abc", "def", "ghi", "jkl", "mno","pqr", "stu", "vwx", "yz"};
        String[] firstStringUnsorted = {"jkl", "mno","pqr", "stu", "vwx", "yz", "abc", "def", "ghi"};
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno" };

        String[] firstStringReference = firstString;

        List firstList = Arrays.asList(firstString);
        List secondList = Arrays.asList(copyOfFirstString);
        List unsortedList = Arrays.asList(firstStringUnsorted);

        // First Compare arrays using object equals
        System.out.println("<--------------Object.equals-------------------->");
        System.out.println("firstString.equals(copyOfFirstString) : "+firstString.equals(copyOfFirstString));
        System.out.println("firstString.equals(firstStringReference) : "+firstString.equals(firstStringReference));

        // Compare arrays using Arrays.equals
        System.out.println("<--------------Arrays.equals-------------------->");
        System.out.println("Arrays.equals(firstString,copyOfFirstString) : "+Arrays.equals(firstString,copyOfFirstString));
        System.out.println("Arrays.equals(firstString,firstStringReference) : "+Arrays.equals(firstString,firstStringReference));
        System.out.println("Arrays.equals(firstString,firstStringUnsorted) : "+Arrays.equals(firstString,firstStringUnsorted));

        // Compare arrays using Arrays.compare
        System.out.println("<--------------Arrays.compare-------------------->");
        System.out.println("Arrays.compare(firstString,copyOfFirstString) : "+Arrays.compare(firstString,copyOfFirstString));
        System.out.println("Arrays.compare(firstString,firstStringReference) : "+Arrays.compare(firstString,firstStringReference));
        System.out.println("Arrays.compare(firstString,firstStringUnsorted) : "+Arrays.compare(firstString,firstStringUnsorted));
        System.out.println("Arrays.compare(firstStringUnsorted,firstString) : "+Arrays.compare(firstStringUnsorted,firstString));
        System.out.println("Arrays.compare(firstString,partialFirstString) : "+Arrays.compare(firstString,partialFirstString));
        System.out.println("Arrays.compare(partialFirstString,firstString) : "+Arrays.compare(partialFirstString,firstString));

        System.out.println("firstList.equals(unsortedList) "+firstList.equals(unsortedList));
        System.out.println("firstList.equals(secondList) "+firstList.equals(secondList));

    }
}
