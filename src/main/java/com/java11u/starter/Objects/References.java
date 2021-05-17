package com.java11u.starter.Objects;

class TestClass{
    private String a="a";
    private String b="b";

    public TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a+ "-"+b;
    }
}

public class References {
    public static void main(String s[]){
        TestClass aref= new TestClass("a","z");
        TestClass bref= new TestClass("first","last");
        TestClass cref= new TestClass("start","end");

        TestClass dref = null;
        TestClass eref = null;

        aref = bref;
        System.out.println("aref has reference to object "+aref);

    }
}
