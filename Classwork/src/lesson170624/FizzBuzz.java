package lesson170624;
import static lesson170624.SimpleUnit.assertEquals;

/**
 * Created by megmeehey on 24.06.17.
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {

        /* for (int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz(i));
        } */

        System.out.println(assertEquals(fizzBuzz(3), "Fizz"));
        System.out.println(assertEquals(fizzBuzz(5), "Buzz"));
        System.out.println(assertEquals(fizzBuzz(7), "7"));
        System.out.println(assertEquals(fizzBuzz(15), "FizzBuzz"));
        System.out.println(assertEquals(fizzBuzz(45), "More strange one line tests"));

    }

    private static String fizzBuzz(int n) {
        String res = "";
        if (n % 3 == 0) {
            res += "Fizz";
        }
        if (n % 5 == 0) {
            res += "Buzz";
        }
        if (res.length() == 0) {
            res += n;
        }
        return res;
    }

}
