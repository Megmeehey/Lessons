package lesson170704;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Megmeehey on 05.07.2017.
 */
public class RadixSort {
    /**
     * Finds maximum value in array
     * @param array - array, where to do the search
     * @return - maximum value
     */
    static int getMaximumInArray(int array[]) {
        int currentMax = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > currentMax)
                currentMax = array[i];
        return currentMax;
    }


    public static void radixsort(int[] input) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // move to next digit
            placement *= RADIX;
        }
        System.out.println(Arrays.toString(input));
    }

}