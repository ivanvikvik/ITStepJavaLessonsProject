package by.itstep.vikvik.javalessons.lesson28.task02;

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
//        int n = 10;
//        int m = n;
//
//        Student st1 = new Student("Alex");
//        Student st2 = new Student("Alex");
//
//        System.out.println(n == m);
//        System.out.println(st1 == st2);

        String s1 = new String("string");
        s1 = s1.intern();
        String s2 = "string";

        System.out.println(s2 == s1);

    }
}
