package com.java11u.starter.functioninterfaceex.validinvalid;

/*Since toString() is a public method implemented in Object,
  it does not count toward the single abstract method test so Soar is not functional interface*/

public interface Soar {
    abstract String toString();

    /*declaring an abstract method int toString() in an interface would
      not compile since Object's version of the method returns a String.*/


//    abstract int toString();
}
