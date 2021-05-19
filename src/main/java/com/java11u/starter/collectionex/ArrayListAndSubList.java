package com.java11u.starter.collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* subList behaviour is undefined if you try to make structural changes.
        I guess in this particular implementation,
        ConcurrentModificationException was decided as the undefined behaviour.*/

public class ArrayListAndSubList {
    public static void main(String s[]){
        List<String> namesList = new ArrayList<>(List.of("Anne","Edward","Charles", "Barry", "David"));
        List<String> subList = namesList.subList(1,4);
        System.out.println("namelist : "+namesList);
        System.out.println("sublist : "+subList);

    /*  The semantics of the list returned by this method become undefined
        if the backing list (i.e., this list) is structurally modified in any way other
        than via the returned list. (Structural modifications are those that
        change the size of this list, or otherwise perturb it in such a fashion that
        iterations in progress may yield incorrect results.)*/

//        namesList.sort(String :: compareTo);

        /*The returned list is backed by this list, so non-structural changes in the
        returned list are reflected in this list, and vice-versa*/
        Collections.swap(namesList, 0,4);

        System.out.println("namelist : "+namesList);
        System.out.println("sublist : "+subList);


    }
}
