package com.java.sample.java8feaures.function_interfaces;

/*
1. Lambdas are allowed to capture (that is, to reference in their bodies) instance variables and
   static variables without restrictions. But local variables have to be explicitly declared
   final or are effectively final. In other words, lambda expressions can capture local variables
   that are assigned to them only once
2. Lambda can be passed as argument to methods and can access variables outside their scope.
   But they have a restriction: they can’t modify the content of local variables of a method in which
   the lambda is defined. Those variables have to be implicitly final

   because local variables live on the stack and are implicitly confined to the thread they’re in.
   Allowing capture of mutable local variables opens new thread-unsafe possibilities, which are
   undesirable (instance variables are fine because they live on the heap, which is shared across threads)
*/

public class LambdaRestrictions {
    /*the following code doesn’t compile
    because the variable portNumber is assigned to twice:*/
    static int portNumber2 = 552344;
    public  static void main(String s[]){
        int portNumber = 312344;
        Runnable r = () -> System.out.println(portNumber2);
        r.run();
        portNumber = 312344;
        portNumber2 = 512344;
    }
}
