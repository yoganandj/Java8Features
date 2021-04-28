package com.java.sample.java8feaures.function_interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAroundPattern {

    public static String processFile() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/java/sample/java8feaures/function_interfaces/data.txt"))){
               return  br.readLine();
        }
    }

    public static String processFile(BufferReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/java/sample/java8feaures/function_interfaces/data.txt"))){
            return  p.processFile(br);
        }
    }

    public static void main(String s[]) throws IOException {
        System.out.println(processFile());
        System.out.println("-----------------------------");
        String output = processFile(( BufferedReader br ) -> br.readLine() + br.readLine());
        System.out.println(output);
    }
}
