package by.itstep.vikvik.javalessons.lesson46;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.apache.log4j.Logger;

import java.io.*;
import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class Main {

    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

    private static int count;

    static {
        String fileName = "D:/Test/log.txt";
        try {
            System.setErr(new PrintStream(fileName));
        }catch(FileNotFoundException exception){
            //...
        }
    }

    public static long factorial(int number) throws WrongNumberArgsException {
        count++;
        System.err.println("count = " + count);
        System.err.println("method starts with arg = " + number);

        if (number < 0) {
            System.err.println("Exception. Wrong number!!! Number should be positive.");
            throw new WrongNumberArgsException("Wrong number!!! Number should be positive.");
        }

        long factorial = 1;
        System.err.println("Algorithm starts with factorial = " + factorial);

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.err.println("method ends with result = " + factorial);

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input your number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            try {
                long result = factorial(number);
                System.out.printf("\n%d! = %d", number, result);
            } catch (WrongNumberArgsException exception) {
                System.err.println(exception);
                System.err.println(exception.getMessage());
            }
        }
    }
}
