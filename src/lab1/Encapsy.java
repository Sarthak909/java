package oop.encapsulation;

import java.lang.reflect.Field;

class employe{
    private double salary;
    private String name;

}

public class Encap {


    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        Field fsalary=  Field.class.getDeclaredField("salary");
        fsalary.setAccessible(true);


    }
}
