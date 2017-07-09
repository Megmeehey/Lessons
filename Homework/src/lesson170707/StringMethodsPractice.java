package lesson170707;

import static lesson170624.SimpleUnit.assertEquals;

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

            System.out.println("Assert replace s to r = " + replace("Assert", 's', 'r'));
            System.out.println("Assert replace t to A = " + replace("Assert", 't', 'A'));
            System.out.println("Assert replace A to t = " + replace("Assert", 'A', 't'));

            System.out.println("Assert replace sert to m = " + replace("Assert", "sert", 'm'));
            System.out.println("Assert replace As to Z = " + replace("Assert", "As", 'Z'));

            System.out.println("Assert replace ert to REPL = " + replace("Assert", "ert", "REPL"));
            System.out.println("Assert replace A to REPL = " + replace("Assert", 'A', "REPL"));

            System.out.println("Assert replace ser to JAVA = " + replace("Assert", "ser", "JAVA"));
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

    public static String replace(String str, char toReplace, char replacement) {
        if (str == null && str.length() == 0) {
            return str;
        }

        int index = str.indexOf(toReplace);
        if (index != -1) {
            return str.substring(0, index) + replacement + str.substring(index + 1, str.length());
        } else {
            return str;
        }
    }


    public static String replace(String str, char toReplace, String replacement) {
        if (str == null && str.length() == 0) {
            return str;
        }

        int index = str.indexOf(toReplace);

        if (index != -1) {
            return str.substring(0, index) + replacement + str.substring(index + 1, str.length());
        } else {
            return str;
        }
    }


    public static String replace(String str, String toReplace, char replacement) {
        if (str == null && str.length() == 0) {
            return str;
        }

        int index = str.indexOf(toReplace);

        if (index != -1) {
            return str.substring(0, index) + replacement + str.substring(index + toReplace.length(), str.length());
        } else {
            return str;
        }
    }


    public static String replace(String str, String toReplace, String replacement) {
        if (str == null && str.length() == 0) {
            return str;
        }

        int index = str.indexOf(toReplace);


        if (index != -1) {
            return str.substring(0, index) + replacement + str.substring(index + toReplace.length(), str.length());
        } else {
            return str;
        }
    }
}