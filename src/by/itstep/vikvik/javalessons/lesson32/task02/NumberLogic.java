package by.itstep.vikvik.javalessons.lesson32.task02;

//base-case
//0...9 -> 0...9

//f(12345) = 5 + 4 + 3 + 2 + 1

import java.util.ArrayList;

public class NumberLogic {
    public static int sumAllDigits(int number) {
        // passive fool-prove
//        if(number < 0) {
//            return -1;
//        }

        //active fool-prove
        number = number >= 0 ? number : -number;

        //base-case
        if (number < 10) {
            return number;
        }

        return number % 10 + sumAllDigits(number / 10);

    }

    public static void main(String[] args) {
        System.out.println(sumAllDigits(123456789) == 45);
        System.out.println(sumAllDigits(-123456789) == 45);
        System.out.println(sumAllDigits(0) == 0);
        System.out.println(sumAllDigits(9) == 9);
        System.out.println(sumAllDigits(-1) == 1);
        System.out.println(sumAllDigits(10) == 1);

    }
}
