package by.itstep.vikvik.javalessons.lesson29.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RND = new Random();

    public static void randomInit(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(max - min + 1) + min;
        }
    }

    public static void userInit(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
    }

    public static int inputIntValue(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextInt();
    }
}
