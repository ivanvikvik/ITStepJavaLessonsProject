package by.itstep.vikvik.javalessons.lesson31.task01;

public class FibonacciLogic {
    // 1 2 3 4 5 6 7  8  9 10 11 12
    // 0 1 1 2 3 5 8 13 21 34 55 89 ...

    public static int getFibonacciNumber(int index) {

        if (index <= 0) {
            return -1;
        }

        int first = 0;
        int second = 1;

        if (index == 1 || index == 2) {
            return index - 1;
        }

        int fib = second + first;

        for (int i = 3; i < index ; i++) {
            first = second;
            second = fib;
            fib = second + first;
        }

        return fib;
    }
}
