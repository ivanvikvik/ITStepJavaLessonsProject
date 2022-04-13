package by.itstep.vikvik.javalessons.lesson29.task01a;

public class ArrayLogic {
    public static int countNonZeroElements(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int element : array) {
            if (element != 0) {
                count++;
            }
        }

        return count;
    }
}