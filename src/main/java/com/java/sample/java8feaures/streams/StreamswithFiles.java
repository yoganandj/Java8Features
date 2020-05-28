package com.java.sample.java8feaures.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamswithFiles {
    public static void main(String s[]) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\pc\\IdeaProjects\\Java8LambdaAndStreams\\src\\data.txt"), Charset.defaultCharset());

        lines.map(w -> w.split(" "))
                .flatMap(Arrays :: stream)
                .distinct()
                .forEach(System.out :: println);

    }
}
