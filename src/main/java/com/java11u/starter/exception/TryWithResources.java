package com.java11u.starter.exception;

/* 1. Java includes the try-with-resources statement to automatically close all resources opened
   in a try clause. This feature is also known as automatic resource management,
   because Java automatically takes care of the closing.
   2. It turns out a catch block is optional with a try-with-resources statement.*/

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    // both readFile and readFile1 method are equal
    public void readFile(String file) {
     try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
         } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFile1(String file) {
         FileInputStream is = null;
         try {
                is = new FileInputStream("myfile.txt");
                // Read file data
             } catch (IOException e) {
               e.printStackTrace();
            } finally {
               if(is != null) {
                      try {
                             is.close();
                          } catch (IOException e2) {
                             e2.printStackTrace();
                          }
                   }
            }
    }
}
