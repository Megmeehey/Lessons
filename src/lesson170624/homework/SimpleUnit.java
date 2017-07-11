package lesson170624.homework;

/**
 * Created by Zaal Lyanov on 24.06.17.
 * Updatet by Megmeehey on 26.06.17.
 */

public class SimpleUnit {
    public static final String EXPECTED = " failed: expected '";
    public static final String ACTUAL = "', but actual ";
    public static final String EXPECTED_NOT = " failed: expected NOT '";
    private static int testNumber;
    public static final String TEST = "Test #";


    static {
        testNumber = 0;
    }

    public static void dropTestNumber() {
        testNumber = 0;
    }

    public static boolean assertEquals(String actual, String expected) {
        boolean equals = actual.equals(expected);
        testNumber++;
        if (!equals) {
            System.err.println(TEST + testNumber + EXPECTED + expected + ACTUAL + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        boolean notEquals = !actual.equals(expected);
        testNumber++;
        if (!notEquals) {
            System.err.println(TEST + testNumber + EXPECTED_NOT + expected + ACTUAL + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean eq = actual == expected;
        testNumber++;
        if (!eq) {
            System.err.println(TEST + testNumber + EXPECTED + expected + ACTUAL + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean nEq = actual != expected;
        testNumber++;
        if (!nEq) {
            System.err.println(TEST + testNumber + EXPECTED_NOT + expected + ACTUAL + actual);
        }
        return nEq;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean eq = actual == expected;
        testNumber++;
        if (!eq) {
            System.err.println(TEST + testNumber + EXPECTED + expected + ACTUAL + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean nEq = actual != expected;
        testNumber++;
        if (!nEq) {
            System.err.println(TEST + testNumber + EXPECTED_NOT + expected + ACTUAL + actual);
        }
        return nEq;
    }
}