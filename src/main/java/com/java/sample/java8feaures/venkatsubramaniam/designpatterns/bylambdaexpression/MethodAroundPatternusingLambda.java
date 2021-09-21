package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

import java.util.function.Consumer;

public class MethodAroundPatternusingLambda {

    public static void main(String[] args) {
        Resource.use(r -> {
            r.op1()
              .op2();
        });
    }
}

class Resource {
    private Resource() { System.out.println("Created ..... "); }
    public Resource op1() { System.out.println("op1"); return this;}
    public Resource op2() { System.out.println("op2"); return this;}
    public  void close() { System.out.println("cleanup...."); }

    public static void use(Consumer<Resource> block){
        Resource resource = new Resource();
        try{
            block.accept(resource);
        }finally {
            resource.close();
        }
    }
}
