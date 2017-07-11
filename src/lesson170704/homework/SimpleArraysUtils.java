package lesson170704.homework;

import java.util.Random;

/**
 * Created by Megmeehey on 05.07.2017.
 */
public class SimpleArraysUtils {
    private static final String DELIMITER = ", ";
    private static final String OPENINGBRACKET = "[";
    private static final String CLOSINGBRACKET = "]";
    /*
     * Series of Prints array methods for boxed values and primitives
     */

    //region StringBuilder variant
    /*
    public static <E> String printArray(E[] array) {
        if (array == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(OPENINGBRACKET);
        if (array.length > 0) {
            sb.append(array[0]);
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]).append(DELIMITER);
            }
        }
        return sb.append(CLOSINGBRACKET).toString();
    }
    */
    //endregion

    /**
     * @param array - Array to print
     * @param <E>   - Type of variables in given array
     *              (Better to return builded string with StringBuider)
     */
    public static <E> void printArray(E[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(boolean[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(byte[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(char[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(short[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(long[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(float[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    public static void printArray(double[] array) {
        if (array == null) {
            System.out.print("null");
            return;
        }
        System.out.print(OPENINGBRACKET);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(DELIMITER);
            }
        }
        System.out.print(CLOSINGBRACKET);
    }

    /**
     * Generates array of int. Max int value depends on modulo param
     *
     * @param size   - size of generated array
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
     *
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
