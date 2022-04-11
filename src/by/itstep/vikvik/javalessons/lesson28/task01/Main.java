package by.itstep.vikvik.javalessons.lesson28.task01;


class Student {
    public String name;
}

public class Main {
    public static int test(int number) {
        number *= 2;
        return number;
    }

    public static void test(Student student) {
        student.name = "Kate";
    }

    public static void test(StringBuilder str) {
        str.append(" Great!!!");
    }

    public static String test(String str) {
        str += " Great!!!";
        return str;
    }

    public static void test(Integer number) {
        number *= 2;
    }

    public static void main(String[] args) {
//        int original = 10;
//
//        System.out.println("Before: value = " + original);
//        original = test(original);
//        System.out.println("After: value = " + original);

//        Student student = new Student();
//        student.name = "Alex";
//
//        System.out.println("Before: value = " + student.name);
//        test(student);
//        System.out.println("After: value = " + student.name);

//        StringBuilder msg = new StringBuilder("Java is");
//        test(msg);
//        System.out.println("After: " + msg);

//        String msg = new String("Java is");
//        msg = test(msg);
//        System.out.println("After: " + msg);

        Integer num  = new Integer(10);
        test(num);
        System.out.println("After: " + num);


    }
}

