package com.java.sample.java8feaures.function_interfaces;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferReaderProcessor {

    String processFile(BufferedReader p) throws IOException;;
}
