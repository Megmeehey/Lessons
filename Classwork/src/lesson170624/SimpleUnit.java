package lesson170624;

/**
 * Created by Megmeehey on 24.06.17.
 */
public class SimpleUnit {
    public static String assertEquals(String actual, String expected) {
        boolean eq = actual.equals(expected);
        if (eq) {
            return "OK";
        }
        else {
            return "Test failed: expected " + expected + ", but actual " + actual;
        }
    }
}
