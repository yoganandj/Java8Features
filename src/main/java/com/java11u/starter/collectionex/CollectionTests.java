package com.java11u.starter.collectionex;

import java.util.Collection;
import java.util.List;

public class CollectionTests {

    public static <T> void doStuffWithCollection(Collection<T> h, T addValue1, T addValue2, T removedValue){
        System.out.println("STart of method : "+h);
        try{
            System.out.println("After adding null "+h.add(null)+" : "+h);
        }catch (Exception e){
            System.out.println("Exception adding null "+e);
        }

        // Add element
        System.out.println("After adding "+addValue1+" "+h.add(addValue1)+" : "+h);

        // check adding element is duplicate
        System.out.println("After adding "+addValue2+" "+h.add(addValue2)+" : "+h);

        // Remove element
        System.out.println("After removing "+removedValue+" "+h.remove(removedValue)+" : "+h);

        try{
            System.out.println("After removing null "+h.remove(null)+" : "+h);
        }catch (Exception e){
            System.out.println("Exception removing null "+e);
        }

        if( addValue1 instanceof String){
            performBulkFunctionsString((Collection<String>) h);
        }else if( addValue1 instanceof Integer){
            performBulkFunctionsInteger((Collection<Integer>) h);
        }

    }

    // Bulk functions with Integers
    private static void performBulkFunctionsInteger(Collection<Integer> h){
        System.out.println("After addSeveral  "+h.addAll(List.of(5,10,15,20,25,25))+" : "+h);
        System.out.println("containsAll(10, 20, 90, 100)  "+h.containsAll(List.of(10,20,90,100))+" : "+h);
        System.out.println("removeAll(10, 20, 90, 100)  "+h.removeAll(List.of(20,30))+" : "+h);
        System.out.println("retainAll(10,20,30,40,50,90)  "+h.retainAll(List.of(10,20,30,40,50,90))+" : "+h);
    }

    // Bulk functions with Integers
    private static void performBulkFunctionsString(Collection<String> h){
        System.out.println("After addSeveral  "+h.addAll(List.of("George","Harry","Isabel"))+" : "+h);
        System.out.println("containsAll(Fed,Harry,Isabel)  "+h.containsAll(List.of("Fed","Harry","Isabel"))+" : "+h);
        System.out.println("containsAll(Anne,Harry,Isabel)  "+h.containsAll(List.of("Anne","Harry","Isabel"))+" : "+h);
        try{
            System.out.println("removeAll(Harry,Isabel)  "+h.removeAll(List.of("Harry","Isabel"))+" : "+h);
        }catch (Exception e){
            System.out.println("Exception removeAll containAll "+e);
        }
//        System.out.println("retainAll(10,20,30,40,50,90)  "+h.retainAll(List.of(10,20,30,40,50,90))+" : "+h);
    }

    public static void main(String s[]){

    }
}
