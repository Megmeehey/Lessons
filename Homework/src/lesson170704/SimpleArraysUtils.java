package lesson170704;

import java.util.Random;

/**
 * Created by Megmeehey on 05.07.2017.
 */
public class SimpleArraysUtils {

    /*
     * Series of Prints array methods for boxed values and primitives
     */

    /**
     * @param array - Array to print
     * @param <E> - Type of variables in given array
     *           Better to return builded string.
     */
    public static <E> void printArray(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(boolean[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(byte[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(short[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(long[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    /**
     * Generates array of int. Max int value depends on modulo param
     * @param size - size of generated array
     * @param modulo - int value limiter
     * @return - generated array
     */
    public static int[] generateIntArray(int size, int modulo) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt() % modulo;
        }
        return array;
    }

    /**
     * Generates array of int.
     * @param size - size of generated array
     * @return - generated array
     */
    public static int[] generateIntArray(int size) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        return array;
    }
}
