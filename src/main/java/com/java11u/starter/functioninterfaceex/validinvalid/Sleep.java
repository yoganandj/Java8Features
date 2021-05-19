package com.java11u.starter.functioninterfaceex.validinvalid;

/*The Sleep interface is also not a valid functional interface.
   Neither snore() nor getZzz() meet the criteria of a single abstract method*/

public interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}
