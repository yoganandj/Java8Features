package com.java11u.starter.functioninterfaceex.validinvalid;

/*Finally, the Climb interface is a functional interface.
  Despite defining a slew of methods, it contains only one abstract method: reach().*/

public interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}
