package com.java.sample.java8feaures.venkatsubramaniam.designpatterns.bylambdaexpression;

public class MethodAroundPattern {
    public static void main(String[] args) {
        Resource1 resource = new Resource1();

        // easy to forget close
        // exception
        resource.op1();
        resource.op1();
        resource.close();

//        1. alternative :
        // verbose
        try{
            resource.op1();
            resource.op1();
        }finally {
            resource.close();
        }

//        2. Java 7 : ARM-Automatic Resource Management
        /*try(Resource resource1 = new Resource()){
            resource.op1();
            resource.op1();
        }*/
    }
}

//class Resource implements AutoCloseable{
class Resource1{

    public Resource1() { System.out.println("Created ..... "); }
    public void op1() { System.out.println("op1"); }
    public void op2() { System.out.println("op2"); }
    public  void close() { System.out.println("cleanup...."); }

}
