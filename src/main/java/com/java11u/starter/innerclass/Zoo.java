package com.java11u.starter.innerclass;

public class Zoo {
    private String name;
    private interface Paper {
        public String getId();
    }
    public class Ticket implements Paper {
        private String serialNumber;
        public String getId() { return serialNumber; }
    }
    public Ticket sellTicket(String serialNumber) {
        Ticket t = new Ticket();
        t.serialNumber = serialNumber;
        return t;
    }

    public static void main(String s[]){
        Zoo t = new Zoo();
        t.name = "private";
        System.out.println("name : "+t.name);
    }
}
