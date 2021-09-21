package com.java.sample.java8feaures.venkatsubramaniam.defaultmethods;

public class DefaultMethodEx {
    /*
    1. Primary purpose : interface evolution
      - historically , adding a method to an interface was an incompatible change
      - default methods (mostly) make this compatible
    2. Java 8 uses default methods in several ways
      - enable streams on collections
      - Comparator and other combinators
        Predicate.and(), Predicate.or(), Function.compose(), etc.
      - implementor convenience (iterator.remove)

      Ex :
      interface Iterator {
          default void remove(){
                throw new UnsupportedOperationException();
          }
     3.
      */
}
