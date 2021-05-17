package com.java.sample.java8feaures.method_references;

import java.util.function.Function;

public class MethodReferenceAndPipelines {

    public static void main(String s[]){
        Function<String, String> addHeader = Letter :: addHeader;
//        System.out.println(addHeader.apply("Yoganand"));

        Function<String, String> transformationPipeline = addHeader.andThen(Letter :: checkSpelling).andThen(Letter :: addFooter);
        System.out.println(transformationPipeline.apply("Yoganand"));

        Function<String, String> compose = addHeader.compose(Letter :: addFooter);
        System.out.println(compose.apply("Yoganand"));
    }
}
