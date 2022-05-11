package by.itstep.vikvik.javalessons.lesson32.task05;

//1 2 4 8 16 32 64 128 256 512 1024

//base-case
// 2 -- > true
//  --> false

// recursion-case
// f(8) --> f (8 / 2 = 4) --> f(2) --> true
// f(36) --> f(18) --> f(9) --> false

public class NumberLogic {

    public static boolean check(int number, int degree) {
        // base-case
        if (number == degree) {
            return true;
        }

        if (number % degree != 0) {
            return false;
        }

        return check(number / degree, degree);
    }

    public static void main(String[] args) throws Exception {

    }
}
