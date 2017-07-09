package lesson170707;
import static lesson170624.SimpleUnit.*;
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

    public static String trim(String str) {
        if (str == null && str.length() == 0) {
            return str;
        }

        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex < str.length() && str.charAt(startIndex) == ' ') {
            startIndex++;
        }

        while (endIndex > 0 && str.charAt(endIndex) == ' ') {
            endIndex--;
        }

        if (startIndex == 0 && endIndex == str.length() - 1) {
            return str;
        } else {
            return str.substring(startIndex, endIndex + 1);
        }
    }

}
