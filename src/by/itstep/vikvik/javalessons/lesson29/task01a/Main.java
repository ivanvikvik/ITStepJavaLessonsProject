package by.itstep.vikvik.javalessons.lesson29.task01a;

import by.itstep.vikvik.javalessons.lesson29.util.ArrayInitializer;
import by.itstep.vikvik.javalessons.view.Printer;

import java.util.Arrays;
import java.util.Objects;

public class Main extends Object {

    private int number;
    private boolean flag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return number == main.number && flag == main.flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, flag);
    }

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of array: ");
        int[]array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min: ");
        int max = ArrayInitializer.inputIntValue("Input max: ");

        ArrayInitializer.randomInit(array, min, max);

        int count = ArrayLogic.countNonZeroElements(array);

        String msg = String.format("\nCount of non zero array elements = %d", count);
        Printer.print("Array: " + Arrays.toString(array));
        Printer.print(msg);
    }
}
