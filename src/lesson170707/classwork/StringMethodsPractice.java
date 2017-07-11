package lesson170707.classwork;

import static lesson170624.homework.SimpleUnit.assertEquals;
import static lesson170707.homework.StringMethodsPractice.trim;

/**
 * Created by Megmeehey on 07.07.2017.
 */
public class StringMethodsPractice {

    public static void main(String[] args) {

        String[] testStrings = new String[]{"    Hello", "    H e l  lo", "    H e l  lo    ", "H e l  lo    ", "Hello    ", "Hello", ""};

        for (int i = 0; i < testStrings.length; i++) {
            System.out.println("#" + i +") Test string     [" + testStrings[i] + "]");
            System.out.println("#" + i +") Trimmed version [" + trim(testStrings[i]) + "]");
            System.out.println("Assert: " + assertEquals(trim(testStrings[i]), testStrings[i].trim()));
            System.out.println();
        }
    }
}
