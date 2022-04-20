package by.itstep.vikvik.javalessons.lesson31.task01;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFib(1));   //0
        System.out.println(getFib(2));   //1
        System.out.println(getFib(3));   //1
        System.out.println(getFib(10));  //34
    }

    public static int getFib(int index) {
        // base-case
        if (index <= 2) {
            return index - 1;
        }

        // recursion-case
        return getFib(index - 1) + getFib(index - 2);
    }

}
