package lesson170811.homework;

import java.util.*;

public class BinarySearchExample {
    static int testSize;

    public static void setSize(int size) {
        testSize = size;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 15, 16, 23, 42, 43, 44, 45, 46};
        System.out.println(binarySearchNegativeIndex(a, 4));
        System.out.println(binarySearchNegativeIndex(a, 16));
        System.out.println(binarySearchNegativeIndex(a, 44));
        System.out.println(binarySearchNegativeIndex(a, 47));
        System.out.println(binarySearchNegativeIndex(a, 0));
        System.out.println(binarySearchNegativeIndex(a, 9));
        System.out.println(binarySearchNegativeIndex(a, 18));
    }

    public static void main1(String[] args) {
        long[] results = new long[8];
        setSize(1_000_000);
        // testing collections
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet<>();

        int[] testSequence = new int[testSize];

        // using seed, so we get same sequence every time
        Random rnd = new Random(170811);

        for (int i = 0; i < testSequence.length; i++) {
            testSequence[i] = rnd.nextInt();
        }

        int searchElement = testSequence[rnd.nextInt(testSize - 1)];

        long startTime;
        int index = 0;

        // testing block
        System.out.println("LinkedList testing");
        System.out.print("Add. ");
        startTime = System.nanoTime();
        for (int i = 0; i < testSize; i++) {
            linkedList.add(testSequence[i]);
        }
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.print("Sort. ");
        startTime = System.nanoTime();
        Collections.sort(linkedList);
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");


        System.out.print("BinarySearch. ");
        startTime = System.nanoTime();
        Collections.binarySearch(linkedList, searchElement);
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");


        System.out.println("\nArrayList testing");
        System.out.print("Add. ");
        startTime = System.nanoTime();
        for (int i = 0; i < testSize; i++) {
            arrayList.add(testSequence[i]);
        }
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.print("Sort. ");
        startTime = System.nanoTime();
        Collections.sort(arrayList);
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.print("BinarySearch. ");
        startTime = System.nanoTime();
        Collections.binarySearch(arrayList, searchElement);
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.println("\nTreeSet testing");
        System.out.print("Add. ");
        startTime = System.nanoTime();
        for (int i = 0; i < testSize; i++) {
            treeSet.add(testSequence[i]);
        }
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.println("No Sort test (TreeSet is already sorted).");

        System.out.print("BinarySearch. ");
        startTime = System.nanoTime();
        treeSet.contains(searchElement);
        results[index] = System.nanoTime() - startTime;
        System.out.println("Elapsed: " + results[index++] + "ns");

        System.out.println("\n\n************************TABLE************************");
        System.out.println("Testing size: " + testSequence.length);
        String format = "%-11s%14s%14s%14s%n";
        System.out.printf(format, "Operation", "LinkedList", "ArrayList", "TreeSet");
        System.out.printf(format, "Add", results[0], results[3], results[6]);
        System.out.printf(format, "Sort", results[1], results[4], "-");
        System.out.printf(format, "BinSearch", results[2], results[5], results[7]);
    }

    static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1; // returns -1, if key is not present
    }

    /* This version returns index of key, if present and negative index of place, where key should be, otherwise
     * There is only one problem:
     * (Example)
     * In array [1, 2, 3, 4, 5]
     * if we binSearch 1, this method will return 0
     * if we binSearch -1, it will return 0 too.
     * So, we wouldn't be able to detect, if there is such key in the array, or not.
     */
    static int binarySearchNegativeIndex(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int middle = 0;

        if (a.length == 0 || key < a[0]) {
            return 0;
        } else if (a[a.length - 1] < key) {
            return -a.length;
        }
        while (low <= high) {
            middle = low + (high - low) / 2;
            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -middle;
    }

    /* And this version returns index of key, if present and index of place, where key should be, otherwise
     * We're unable to detect if key is actually present.
     */
    static int binarySearchIndex(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int middle = 0;

        if (a.length == 0 || key < a[0]) {
            return 0;
        } else if (a[a.length - 1] < key) {
            return a.length;
        }
        while (low <= high) {
            middle = low + (high - low) / 2;
            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return middle;
    }
}
