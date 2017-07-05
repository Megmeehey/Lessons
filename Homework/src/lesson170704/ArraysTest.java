package lesson170704;

import java.util.Arrays;

import static lesson170627.SimpleUnit.assertEquals;
import static lesson170704.SimpleArraysUtils.*;

/**
 * Created by Megmeehey on 05.07.2017.
 */
public class ArraysTest {
    public static void main(String[] args) {
        System.out.println("Testing simple arrays utils");

        // Q: Is boxing preferable?

        // Arrays to test
        int[] testArray1 = generateIntArray(15, 100);
        char[] testArray2 = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'd', '!'};
        float[] testArray3 = new float[]{3f, 3.1f, 3.14f, 3.141f, 3.1415f, 3.14159f};
        String[] testArray4 = new String[]{"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing elit",
                "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua."};
        Long[] testArray5 = new Long[]{3000L, 4000L, 5000L, 6000L, 123123123123L, 232323232L};

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
    }
}
