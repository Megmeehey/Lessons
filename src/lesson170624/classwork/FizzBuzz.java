package lesson170624.classwork;

import static lesson170624.classwork.SimpleUnit.assertEquals;
import static lesson170624.classwork.SimpleUnit.assertNotEquals;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println("Printing first 100:");
        for (int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz(i));
        }

        processTest(3, "Fizz");
        processTest(5, "Buzz");
        processTest(7, "7");
        processTest(15, "FizzBuzz");

        // assertNotEquals test
        System.out.println(assertNotEquals(fizzBuzz(45), "More strange one line tests"));
    }

    private static void processTest(int n, String expected) {
        System.out.println(assertEquals(fizzBuzz(n), expected));
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
