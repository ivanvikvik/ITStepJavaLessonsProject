package by.itstep.vikvik.javalessons.lesson27.model.data;

import by.itstep.vikvik.javalessons.lesson27.model.data.Human;
import by.itstep.vikvik.javalessons.lesson27.model.data.Leader;
import by.itstep.vikvik.javalessons.lesson27.model.data.Student;
import by.itstep.vikvik.javalessons.lesson27.model.data.Worker;

public class Main extends Object {
    public static void main(String[] args) {
        test(new Human());
        test(new Student());
        test(new Worker());
        test(new Leader());
        Student s;

    }

    public static void test(Human human)
    {
       A a = human.test();
    }
}
