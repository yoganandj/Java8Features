package com.java.sample.java8feaures;

/*
1. Java 8 features can also help improve code readability :
    You can reduce the verbosity of your code, making it easier to understand.
    You can improve the intent of your code by using method references and the Streams API.
2. We describe three simple refactorings that use lambdas, method references, and streams, which
you can apply to your code to improve its readability:
 Refactoring anonymous classes to lambda expressions
 Refactoring lambda expressions to method references
 Refactoring imperative-style data processing to streams
3. Inside an anonymous class, this refers to the anonymous class itself, but
inside a lambda it refers to the enclosing class
4. Second, anonymous classes are allowed to
shadow variables from the enclosing class. Lambda expressions can’t (they’ll cause a compile
error)
5. You can solve the ambiguity by providing an explicit cast (Task):
doSomething((Task)() -> System.out.println("Danger danger!!"));

* * */

public class Java8Features {
}
