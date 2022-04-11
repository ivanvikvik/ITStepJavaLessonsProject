package by.itstep.vikvik.javalessons.lesson28.task03;

import java.util.Locale;

public class Student {
    private final String name;
    private final int age;
    private final double mark;

    public Student() {
        name = "no name";
        age = 0;
        mark = 4;
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student(String name) {
        this.name = name;
        age = 0;
        mark = 4;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        Student st = new Student(name, age, mark);
        return st;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(final int age) {
        Student st = new Student(name, age, mark);
        return st;
    }

    public double getMark() {
        return mark;
    }

    public Student setMark(double mark) {
        Student st = new Student(name, age, mark);
        return st;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
