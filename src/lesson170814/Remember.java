package lesson170814;

import java.util.Arrays;

public class Remember {
    public static void main(String[] args) {
        Integer[] input1 = {1, 3, 5, 7, 2, 4, 6, 8};
        Integer[] input10 = {10, 10, 10, 10, 10, 10, 10, 10};
        Integer[] aux = new Integer[input1.length];

        merge(input1, aux, 0, input1.length - 1, 3);

        System.out.println(Arrays.toString(input1));

        merge(input10, aux, 0, input10.length - 1, 2);

        System.out.println(Arrays.toString(input10));


        Integer[] a2 = {30, 20, 10, 0,};
        sort(a2);

    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        System.out.println(Arrays.toString(a) + " " + lo + " " + hi);
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, hi, mid);
        System.out.println("Merged: " + Arrays.toString(a) + " " + lo + " " + hi);
    }


    public static void merge(Comparable[] a, Comparable[] aux, int lo, int hi, int mid) {
        // copy values to aux array
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // indexes
        int i = lo;
        int j = mid + 1;

        // actual merge
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
