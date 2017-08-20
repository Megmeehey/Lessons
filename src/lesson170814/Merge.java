package lesson170814;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        Integer[] a = {1, 3, 5, 7, 9, 2, 4, 8, 16, 32};
        Integer[] aux = new Integer[a.length];

        merge(a, aux, 0, a.length - 1, 4);

        System.out.println(Arrays.toString(a));
    }

    public static void merge(Comparable[] a, Comparable[] auxillary, int lo, int hi, int mid) {
        for (int i = lo; i <= hi; i++) {
            auxillary[i] = a[i];
        } // use system.arrays.copy

        int i = lo;
        int j = mid + 1;
        for (int k = 0; k <= hi; k++) {
            if (i > mid) {
                a[k] = auxillary[j++];
            } else if (j > hi) {
                a[k] = auxillary[i++];
            } else if (auxillary[j].compareTo(auxillary[i]) < 0) {
                a[k] = auxillary[j];
            } else {
                a[k] = auxillary[i];
            }
        }


    }
}
