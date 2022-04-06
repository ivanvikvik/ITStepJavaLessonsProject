package by.itstep.vikvik.javalessons.lesson27.task02;

public class Test {
    public static void main(String[] args) {
        test(new TestB());
    }

    public static void test(TestA o) {
        o.test();  //!!!                     // TestB
    }
}
