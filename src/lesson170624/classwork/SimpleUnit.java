package lesson170624.classwork;

/**
 * Created by Zaal on 24.06.17.
 */

public class SimpleUnit {

    public static boolean assertEquals(String actual, String expected) {
        boolean equals = actual.equals(expected);
        if (!equals) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        boolean notEquals = !actual.equals(expected);
        if (!notEquals) {
            System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean eq = actual == expected;
        if (!eq) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean nEq = actual != expected;
        if (!nEq) {
            System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);
        }
        return nEq;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean eq = actual == expected;
        if (!eq) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return eq;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean nEq = actual != expected;
        if (!nEq) {
            System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);
        }
        return nEq;
    }
}