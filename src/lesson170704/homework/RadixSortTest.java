package lesson170704.homework;

import java.util.Arrays;
import java.util.Random;

import static lesson170704.homework.RadixSort.radixsort;


/**
 * Created by Megmeehey on 05.07.2017.
 */
public class RadixSortTest {
    public static final int BIGARRAY = 1_000_000;
    public static final int MODULO = 1000;

    public static void main(String[] args) {
        int[] array = {1, 2, 9, 123213, 8, 7, 6, 5, 4, 3, 3, 3, 48};

        performRadix(array);

        int[] bigArray = new int[BIGARRAY];
        Random rnd = new Random();
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i;
        }

        shuffleArray(bigArray);
        performRadix(bigArray);
    }

    private static void shuffleArray(int[] array)
    {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void performRadix(int[] array) {
        System.out.println("Array:        " + Arrays.toString(array));
        radixsort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
