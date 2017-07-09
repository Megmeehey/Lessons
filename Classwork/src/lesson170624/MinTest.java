package lesson170624;
import static lesson170624.MathUtils.min;
import static lesson170624.SimpleUnit.*;

/**
 * Created by Megmeehey on 24.06.17.
 */
public class MinTest {
    public static void main(String[] args) {
        System.out.println(assertEquals(min(10, 20), 10));
        System.out.println(assertEquals(min(-10, 20), -10));
        System.out.println(assertEquals(min(20, 10), 10));
        System.out.println(assertEquals(min(-20, 10), -20));

        System.out.println(assertEquals(min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));
        System.out.println(assertEquals(min(Integer.MAX_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));
        System.out.println(assertEquals(min(Integer.MAX_VALUE, 0), 0));

        System.out.println(assertNotEquals(min(-20, 10), 10));
        System.out.println(assertNotEquals(min(Integer.MAX_VALUE, Integer.MIN_VALUE), 0));
    }
}
