package lesson170624.classwork;

import static lesson170624.classwork.SimpleUnit.assertEquals;
import static lesson170624.classwork.SimpleUnit.assertNotEquals;

public class MaxTest {
    public static void main(String[] args) {
        // Some tests
        System.out.println(assertEquals(MathUtils.max(10, 20), 20));
        System.out.println(assertEquals(MathUtils.max(10, 30), 30));
        System.out.println(assertEquals(MathUtils.max(30, 30), 30));
        System.out.println(assertEquals(MathUtils.max(30, 10), 30));
        System.out.println(assertEquals(MathUtils.max(33, 20), 33));
        System.out.println(assertEquals(MathUtils.max(35, -20), 35));
        System.out.println(assertEquals(MathUtils.max(10, -10), 10));
        System.out.println(assertNotEquals(MathUtils.max(5, -10), -10));

        // Border conditions tests
        System.out.println(assertEquals(MathUtils.max(Integer.MAX_VALUE, -10), Integer.MAX_VALUE));
        System.out.println(assertEquals(MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));
    }
}