package com.java11u.starter.functioninterfaceex.validinvalid;

import com.java11u.starter.functioninterfaceex.Sprint;

/*The Skip interface is not a valid functional interface
because it has two abstract methods*/

public interface Skip extends Sprint {
    void skip();
}
