package by.itstep.vikvik.javalessons.lesson29.task01f;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    private final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};

//    public ArraySorterTest(){
//        System.out.println("ArraySorterTest");
//    }

    @Test
    public void testSortBeforeFirstZeroElement() {
        //int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {2, 4, 5, 9, 0, 7, 5, 1, 0, 8};

        ArraySorter.sortBeforeFirstZeroElement(ARRAY);


        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElement() {
        //int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {0, 1, 2, 4, 5, 5, 7, 9, 0, 8};

        ArraySorter.sortBeforeLastZeroElement(ARRAY);

        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElementWithoutZeroElements() {
        int[] array = {5, 9, 2, 4, 7, 5, 1, 8};
        int[] expectedArray = {5, 9, 2, 4, 7, 5, 1, 8};

        ArraySorter.sortBeforeLastZeroElement(array);

        assertArrayEquals(expectedArray, array);
    }
}
