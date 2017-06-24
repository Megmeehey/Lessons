package lesson170624;
import static lesson170624.MathUtils.mod;
import static lesson170624.SimpleUnit.*;

/**
 * Created by Megmeehey on 24.06.17.
 */

public class ModTest {
    public static void main(String[] args) {
        // Simple
        System.out.println(assertEquals(mod(10, 20), 10));
        System.out.println(assertEquals(mod(20, 10), 0));
        System.out.println(assertEquals(mod(200, 15), 5));
        System.out.println(assertEquals(mod(22, 10), 2));

        // Negative
        System.out.println(assertEquals(mod(-20, 10), 0));
        System.out.println(assertEquals(mod(-20, 6), 4));
        System.out.println(assertEquals(mod(-20, 1), 0));

        // Borders
        System.out.println(assertEquals(mod(Integer.MAX_VALUE, Integer.MAX_VALUE), 0));

        // Divider == 0;
        System.out.println(assertEquals(mod(Integer.MAX_VALUE, 0), Math.abs(Integer.MIN_VALUE)));

        System.out.println(assertNotEquals(mod(-20, 10), 10));
        System.out.println(assertNotEquals(mod(Integer.MAX_VALUE, Integer.MIN_VALUE), 0));
    }
}
