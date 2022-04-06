package by.itstep.vikvik.javalessons.lesson27.model.data;

import java.io.IOException;

public class Human {
    protected String name;

    public void test(A a){
        System.out.println("Human");
    }
}

class Student extends Human{
    public void test(B b) {
        System.out.println("Student");
    }
}

