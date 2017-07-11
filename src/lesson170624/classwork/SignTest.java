package lesson170624.classwork;

import static lesson170624.classwork.MathUtils.sign;
import static lesson170624.classwork.SimpleUnit.assertEquals;
import static lesson170624.classwork.SimpleUnit.assertNotEquals;

/**
 * Created by Megmeehey on 24.06.17.
 */

public class SignTest {
    public static void main(String[] args) {
        // Some tests, including negative numbers
        System.out.println(assertEquals(sign(10), 1));
        System.out.println(assertEquals(sign(0), 0));
        System.out.println(assertEquals(sign(-10), -1));
        System.out.println(assertEquals(sign(-3333), -1));
        System.out.println(assertEquals(sign(3344), 1));

        // Border conditions tests
        System.out.println(assertEquals(sign(Integer.MAX_VALUE), 1));
        System.out.println(assertEquals(sign(Integer.MIN_VALUE), -1));

        // Not equals tests
        System.out.println(assertNotEquals(sign(-20), 0));
        System.out.println(assertNotEquals(sign(Integer.MAX_VALUE), -1));
        System.out.println(assertNotEquals(sign(Integer.MIN_VALUE), 1));
    }
}
