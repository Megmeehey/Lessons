package lesson170704.homework;

import java.util.Arrays;

import static lesson170704.homework.SimpleArraysUtils.generateIntArray;
import static lesson170704.homework.SimpleArraysUtils.printArray;

/**
 * Created by Megmeehey on 05.07.2017.
 */
public class ArraysTest {
    private static short[] nullTestArray;

    public static void main(String[] args) {
        System.out.println("Testing simple arrays utils");

        // Q: Is boxing preferable? (Arrays.toStings)
        // Convenient to do using apache commons lang ArrayUtils
        // Arrays to test
        int[] testArray1 = generateIntArray(15, 100);
        char[] testArray2 = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        float[] testArray3 = new float[]{3f, 3.1f, 3.14f, 3.141f, 3.1415f, 3.14159f};
        String[] testArray4 = new String[]{"I", "don't", "know", "what", "to", "write", "here.", "Really!", "Oh", "wait...", "Hey", "mom", "I'm", "on", "TV!!!"};
        Long[] testArray5 = new Long[]{1337L, 9001L, 100500L, 271828182846L, 170706L};
        double[] testArray6 = new double[]{};

        // Actual testing
        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray1));
        System.out.print("Actual: ");
        printArray(testArray1);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray2));
        System.out.print("Actual: ");
        printArray(testArray2);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray3));
        System.out.print("Actual: ");
        printArray(testArray3);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray4));
        System.out.print("Actual: ");
        printArray(testArray4);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray5));
        System.out.print("Actual: ");
        printArray(testArray5);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(testArray6));
        System.out.print("Actual: ");
        printArray(testArray6);
        System.out.println();

        System.out.print("Expect: ");
        System.out.println(Arrays.toString(nullTestArray));
        System.out.print("Actual: ");
        printArray(nullTestArray);
        System.out.println();
    }
}