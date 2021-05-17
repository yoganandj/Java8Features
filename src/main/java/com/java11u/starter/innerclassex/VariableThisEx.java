package com.java11u.starter.innerclassex;

public class VariableThisEx {
    private int x = 10;
   class B {
       private int x = 20;

       class C {
           private int x = 30;

           public void allTheX() {
               System.out.println(x);        // 30
               System.out.println(this.x);   // 30
               System.out.println(B.this.x); // 20
               System.out.println(VariableThisEx.this.x); // 10
           }
       }
   }

   public static void main(String s[]){
       VariableThisEx a  = new VariableThisEx();
       VariableThisEx.B b  = a.new B();
       VariableThisEx.B.C c = b.new C();
       c.allTheX();
   }

}
