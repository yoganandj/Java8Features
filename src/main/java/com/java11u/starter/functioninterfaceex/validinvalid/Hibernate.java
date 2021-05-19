package com.java11u.starter.functioninterfaceex.validinvalid;

/*the Hibernate interface uses equals(Hibernate) instead of equals(Object).
  Because this does not match the method signature of the equals(Object) method defined
  in the Object class, this interface is counted as containing two abstract methods:
  equals(Hibernate) and rest(). SO Hibernate is not functional interface*/

public interface Hibernate {
    String toString();
    public boolean equals(Hibernate o);
    public abstract int hashCode();
    public void rest();
}
