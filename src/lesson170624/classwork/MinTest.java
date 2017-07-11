package lesson170624.classwork;
import static lesson170624.classwork.MathUtils.min;
import static lesson170624.classwork.SimpleUnit.assertEquals;
import static lesson170624.classwork.SimpleUnit.assertNotEquals;

/**
 * Created by Megmeehey on 24.06.17.
 */
public class MinTest {
    public static void main(String[] args) {
        // Some tests, including negative numbers
        System.out.println(assertEquals(min(10, 20), 10));
        System.out.println(assertEquals(min(-10, 20), -10));
        System.out.println(assertEquals(min(20, 10), 10));
        System.out.println(assertEquals(min(-20, 10), -20));

        // Border conditions tests
        System.out.println(assertEquals(min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));
        System.out.println(assertEquals(min(Integer.MAX_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));
        System.out.println(assertEquals(min(Integer.MAX_VALUE, 0), 0));

        // Not equals tests
        System.out.println(assertNotEquals(min(-20, 10), 10));
        System.out.println(assertNotEquals(min(Integer.MAX_VALUE, Integer.MIN_VALUE), 0));
    }
}
