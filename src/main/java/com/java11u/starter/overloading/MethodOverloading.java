package com.java11u.starter.overloading;

/*
        Java tries to use the most specific parameter list it can find.
        When the primitive int version isn’t present, it will autobox.
        However, when the primitive int version is provided,
        there is no reason for Java to do the extra work of autoboxing.

        When some of the types interact, the Java rules focus on backward compatibility.
        A long time ago, autoboxing and varargs didn’t exist. Since old code still needs to work,
        this means autoboxing and varargs come last when Java looks at overloaded methods
*/
public class MethodOverloading {

    public void fly(int numMiles) { System.out.println("fly - int "+numMiles);}
    public void fly(Integer numMiles) { System.out.println("fly - Integer "+numMiles);}
    public static void main(String s[]){
        MethodOverloading obj = new MethodOverloading();
        obj.fly(100);
        obj.fly(200);
    }
}
