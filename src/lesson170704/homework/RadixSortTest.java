package lesson170704.homework;

import java.util.Arrays;
import java.util.Random;

import static lesson170704.homework.RadixSort.radixsort;

public class RadixSortTest {
    public static final int BIGARRAY = 1_000_000;

    public static void main(String[] args) {

        int[] bigArray = new int[BIGARRAY];
        int[] anotherBigArray = new int[BIGARRAY];
        // int[] yetAnotherBigArray = new int[BIGARRAY];

        Random rnd = new Random();
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i;
            anotherBigArray[i] = i;
        }

        shuffleArray(bigArray);
        shuffleArray(anotherBigArray);
        performRadix(bigArray, anotherBigArray);
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

    private static void performRadix(int[] array, int[] anotherArray) {
        long start = System.currentTimeMillis();
        array = radixsort(array);
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed, while sorting (in millis): " + (end - start));

        // Check if it is working
        Arrays.sort(anotherArray);
        System.out.println("It's sorted, right?");
        if (Arrays.equals(array, anotherArray)) {
            System.out.println("YEP!");
        } else {
            System.out.println("Nope, sorry! :(");
        }
    }
}
