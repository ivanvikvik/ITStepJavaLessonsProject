package by.itstep.vikvik.javalessons.lesson32.task01;

// recursion case
//5! = 5 * 4!
//4! = 4 * 3!
//3! = 3 * 2!
//2! = 2 * 1!

// base-case
//1! = 1
//0! = 1

public class NumberLogic {
    //0!
    public static int zero() {
        return 1;
    }

    //1!
    public static int first() {
        return 1;
    }

    //2!
    public static int second() {
        return 2 * first();
    }

    //3!
    public static int third() {
        return 3 * second();
    }

    //4!
    public static int fourth() {
        return 4 * third();
    }

    //5!
    public static int fifth() {
        return 5 * fourth();
    }

    //n!
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }

        //base-case
        if (n <= 1) {
            return 1;
        }
        // recursion-case
        return n * factorial(n - 1);
    }

    public static int factorial2(int n) {
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(fifth());
    }
}
