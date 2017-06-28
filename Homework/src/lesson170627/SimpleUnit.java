package lesson170627;

/**
 * Created by Zaal Lyanov on 24.06.17.
 * Updatet by Megmeehey on 26.06.17.
 */

public class SimpleUnit {
    private static int testNumber;

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
            System.err.println("Test #" + testNumber + " failed: expected " + expected + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        boolean notEquals = !actual.equals(expected);
        testNumber++;
        if (!notEquals) {
            System.err.println("Test #" + testNumber + " failed: expected NOT " + expected + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean eq = actual == expected;
        testNumber++;
        if (!eq) {
            System.err.println("Test #" + testNumber + " failed: expected " + expected + ", but actual " + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean nEq = actual != expected;
        testNumber++;
        if (!nEq) {
            System.err.println("Test #" + testNumber + " failed: expected NOT " + expected + ", but actual " + actual);
        }
        return nEq;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean eq = actual == expected;
        testNumber++;
        if (!eq) {
            System.err.println("Test #" + testNumber + " failed: expected " + expected + ", but actual " + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean nEq = actual != expected;
        testNumber++;
        if (!nEq) {
            System.err.println("Test #" + testNumber + " failed: expected NOT " + expected + ", but actual " + actual);
        }
        return nEq;
    }
}