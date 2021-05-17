package com.java11u.starter.finalmodifier;

public class FinalModifierEx {
    private static void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe+" "+lemur);
    }

    private void printZooInfo2(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
         /*The giraffe variable is already assigned a value,
         so attempting to assign it a new value is not permitted.*/

//        giraffe = 3; // DOES NOT COMPILE

/*        The compiler does not allow the use of local variables that may not have been
        assigned a value, whether they are marked final or not.*/
        
//        System.out.println(giraffe+" "+lemur); // DOES NOT COMPILE
    }

    public static void main(String s[]){
        printZooInfo(false);
    }
}
