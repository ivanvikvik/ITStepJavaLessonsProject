package by.itstep.vikvik.javalessons.lesson35;

import java.util.Objects;

class A {
    private int f1;
    private double f2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return f1 == a.f1 && Double.compare(a.f2, f2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(f1, f2);
    }
}

class B extends A {
}

class C extends B {
    private int f1;
    private double f2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof C)) return false;
        if (!super.equals(o)) return false;
        C c = (C) o;
        return f1 == c.f1 && Double.compare(c.f2, f2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), f1, f2);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getSimpleName());

//        Box<String> box1 = new Box<>();
//        box1.setValue("100");
//
//        Box<Student> sbox = new Box<>();
//        sbox.setValue(new Student());
//
//
//        System.out.println(box1);
    }
}
