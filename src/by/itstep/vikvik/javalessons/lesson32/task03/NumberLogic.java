package by.itstep.vikvik.javalessons.lesson32.task03;

//1)
//base-case
// length == 1 -> array[0]

// recursion-case
//f([1 2 3 4 5 6]) = 6 + f([1 2 3 4 5])

//2)
//base-case
//  == 1 -> array[0]

// recursion-case
//f([1 2 3 4 5 6], 0) = 1 + f([1 2 3 4 5 6], 1)
//f([1 2 3 4 5 6], 1) = 2 + f([1 2 3 4 5 6], 2)
//f([1 2 3 4 5 6], 2) = 3 + f([1 2 3 4 5 6], 3)


public class NumberLogic {
    public static int sumAllElements2(int[] array) throws Exception {
        // passive fool-prove
        if (array == null || array.length == 0) {
            throw new Exception();
        }

        return sumElements(array, 0);
    }

    private static int sumElements(int[] array, int index) {
        //base-case
        if (index == array.length - 1) {
            return array[array.length - 1];
        }

        return array[index] + sumElements(array, ++index);
    }


    public static int sumAllElements(int[] array) throws Exception {
        // passive fool-prove
        if (array == null || array.length == 0) {
            throw new Exception();
        }

   //     int n = 10;

        // base-case
        if (array.length == 1) {
            return array[0];
        }

        // recursion-case
        int size = array.length - 1;
        int[] temp = new int[array.length - 1];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        return array[size] + sumAllElements(temp);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumAllElements2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) == 45);
        System.out.println(sumAllElements2(new int[]{7}) == 7);

        try {
            sumAllElements2(null);
            System.out.println(false);
        } catch(Exception exception) {
            System.out.println(true);
        }
    }
}
