package com.java11u.starter.finalmodifier;

/*The rules for static final variables are similar to instance final variables,
  except they do not use static constructors (there is no such thing!) and
  use static initializers instead of instance initializers.*/

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height; // DOES NOT COMPILE
    static { bamboo = 5;}
}
