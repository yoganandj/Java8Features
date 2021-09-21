package com.java.sample.java8feaures.venkatsubramaniam.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqual {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee,String> map = new HashMap<>();
        map.put(emp1, "Jack");
        map.put(emp2, "Jack");

        System.out.println(map.size());
        System.out.println(map.entrySet());

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(i1, "one");
        map1.put(i2, "one");

        System.out.println(map1.size());
        System.out.println(map1.entrySet());


    }
}

class Employee{
    int id;

    public Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
