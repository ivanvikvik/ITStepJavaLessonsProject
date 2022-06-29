package by.itstep.vikvik.javalessons.lesson46;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.apache.log4j.BasicConfigurator;
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

    public static long factorial(int number) throws WrongNumberArgsException {
        count++;
        LOG.debug("count = " + count);
        LOG.debug("method starts with arg = " + number);

        if (number < 0) {
            LOG.debug("Exception. Wrong number!!! Number should be positive.");
            throw new WrongNumberArgsException("Wrong number!!! Number should be positive.");
        }

        long factorial = 1;
        LOG.debug("Algorithm starts with factorial = " + factorial);

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        LOG.info("method ends with result = " + factorial);

        return factorial;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOG.fatal("This is fatal message");
        LOG.error("This is error message");
        LOG.warn("This is warn message");
        LOG.info("This is info message");
        LOG.debug("This is debug message");
        LOG.trace("This is trace message");

//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Input your number: ");
//            int number = scanner.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//
//            try {
//                long result = factorial(number);
//                String s = String.format("\n%d! = %d", number, result);
//                System.out.printf(s);
//                LOG.info(s);
//            } catch (WrongNumberArgsException exception) {
//                LOG.warn("Exception", exception);
//            }
//        }
    }
}
