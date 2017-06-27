package lesson170624;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static lesson170624.MathUtils.*;
import static lesson170624.SimpleUnit.*;

/**
 * Created by Megmeehey on 26.06.2017.
 */

public class Tests {
    public static void main(String[] args) {
        System.out.println("Testing utils");

        showHelp();
        int com = 0;
        String s = "";

        while (true) {
            System.out.print(">");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                s = br.readLine();
                if ("help".equals(s)) {
                    com = -42;
                }
                else {
                    com = Integer.parseInt(s);
                }
            }
            catch (Exception e) {
                System.err.println("Invalid Format! " + e.getStackTrace());
                com = Integer.MAX_VALUE;
            }
            switch (com) {
                case -42:
                    showHelp();
                    break;
                case 1:
                    testSign();
                    break;
                case 2:
                    testMod();
                    break;
                case 3:
                    testIsPrime();
                    break;
                case 4:
                    testIsFibonacci();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command. Type \"help\" for help.\n");
                    break;
            }
        }

    }

    public static void showHelp() {
        System.out.println("1 - Test \"sign(int)\"");
        System.out.println("2 - Test \"mod(int, int)\"");
        System.out.println("3 - Test \"isPrime(int)\"");
        System.out.println("4 - Test \"isFibonacci(int)\"");
        System.out.println("0 - Exit");
        System.out.println("*************");
    }

    public static void testSign() {
        dropTestNumber();
        // Simple
        System.out.println("#1  Testing sign(10):\t" + assertEquals(sign(10), 1));
        System.out.println("#2  Testing sign(0):\t" + assertEquals(sign(0), 0));
        System.out.println("#3  Testing sign(-10):\t" + assertEquals(sign(-10), -1));
        System.out.println("#4  Testing sign(-3333):\t" + assertEquals(sign(-3333), -1));
        System.out.println("#5  Testing sign(3344):\t" + assertEquals(sign(3344), 1));
        // Borders
        System.out.println("#6  Testing sign(Integer.MAX_VALUE):\t" + assertEquals(sign(Integer.MAX_VALUE), 1));
        System.out.println("#7  Testing sign(Integer.MIN_VALUE):\t" + assertEquals(sign(Integer.MIN_VALUE), -1));
        // NotEquals
        System.out.println("#8  Testing sign(-20):\t" + assertNotEquals(sign(-20), 0));
        System.out.println("#9  Testing sign(Integer.MAX_VALUE):\t" + assertNotEquals(sign(Integer.MAX_VALUE), -1));
        System.out.println("#10 Testing sign(Integer.MIN_VALUE):\t" + assertNotEquals(sign(Integer.MIN_VALUE), 1));
    }

    public static void testIsPrime() {
        dropTestNumber();
        // Simple
        System.out.println("#1  Testing isPrime(10):\t" + assertEquals(isPrime(10), false));
        System.out.println("#2  Testing isPrime(1):\t" + assertEquals(isPrime(1), false));
        System.out.println("#3  Testing isPrime(3):\t" + assertEquals(isPrime(3), true));
        System.out.println("#4  Testing isPrime(5):\t" + assertEquals(isPrime(5), true));
        System.out.println("#5  Testing isPrime(139):\t" + assertEquals(isPrime(139), true));
        System.out.println("#6  Testing isPrime(64):\t" + assertEquals(isPrime(64), false));
        System.out.println("#7  Testing isPrime(71):\t" + assertEquals(isPrime(71), true));
        // Negative
        System.out.println("#8  Testing isPrime(0):\t" + assertEquals(isPrime(0), false));
        System.out.println("#9  Testing isPrime(-10):\t" + assertEquals(isPrime(-10), false));
        System.out.println("#10 Testing isPrime(-11):\t" + assertEquals(isPrime(-11), false));
        System.out.println("#11 Testing isPrime(-1234):\t" + assertEquals(isPrime(-1234), false));
        // Borders
        System.out.println("#12 Testing isPrime(Integer.MAX_VALUE):\t" + assertEquals(isPrime(Integer.MAX_VALUE), true)); // Mersenne prime
        System.out.println("#13 Testing isPrime(Integer.MIN_VALUE):\t" + assertEquals(isPrime(Integer.MIN_VALUE), false));
        // NotEquals
        System.out.println("#14 Testing isPrime(1):\t" + assertNotEquals(isPrime(1), true));
        System.out.println("#15 Testing isPrime(-123):\t" + assertNotEquals(isPrime(-123), true));
        System.out.println("#16 Testing isPrime(199):\t" + assertNotEquals(isPrime(199), false));
    }

    public static void testIsFibonacci() {
        dropTestNumber();
        System.out.println(Integer.MAX_VALUE);
        // Simple
        System.out.println("#1  Testing isFibonacci(10):\t" + assertEquals(isFibonacci(10), false));
        System.out.println("#2  Testing isFibonacci(1):\t" + assertEquals(isFibonacci(1), true));
        System.out.println("#3  Testing isFibonacci(2):\t" + assertEquals(isFibonacci(2), true));
        System.out.println("#4  Testing isFibonacci(8):\t" + assertEquals(isFibonacci(8), true));
        System.out.println("#5  Testing isFibonacci(80):\t" + assertEquals(isFibonacci(80), false));
        System.out.println("#6  Testing isFibonacci(1597):\t" + assertEquals(isFibonacci(1597), true));
        // Negative
        System.out.println("#7  Testing isFibonacci(-10):\t" + assertEquals(isFibonacci(-10), false));
        System.out.println("#8  Testing isFibonacci(-110):\t" + assertEquals(isFibonacci(-110), false));
        // Borders
        System.out.println("#9  Testing isFibonacci(0):\t" + assertEquals(isFibonacci(0), true));
        System.out.println("#10 Testing isFibonacci(Integer.MAX_VALUE):\t" + assertEquals(isFibonacci(Integer.MAX_VALUE), false));
        System.out.println("#11 Testing isFibonacci(Integer.MIN_VALUE):\t" + assertEquals(isFibonacci(Integer.MIN_VALUE), false));
        // NotEquals
        System.out.println("#12 Testing isFibonacci(55):\t" + assertNotEquals(isFibonacci(55), false));
        System.out.println("#13 Testing isFibonacci(610):\t" + assertNotEquals(isFibonacci(610), false));
        System.out.println("#14 Testing isFibonacci(611):\t" + assertNotEquals(isFibonacci(611), true));
    }

    public static void testMod() {
        dropTestNumber();
        // Simple
        System.out.println("#1  Testing mod(10, 20):\t" + assertEquals(mod(10, 20), 10));
        System.out.println("#2  Testing mod(20, 10):\t" + assertEquals(mod(20, 10), 0));
        System.out.println("#3  Testing mod(200, 15):\t" + assertEquals(mod(200, 15), 5));
        System.out.println("#4  Testing mod(22, 10):\t" + assertEquals(mod(22, 10), 2));

        // Negative
        System.out.println("#5  Testing mod(-20, 10):\t" + assertEquals(mod(-20, 10), 0));
        System.out.println("#6  Testing mod(-20, 6):\t" + assertEquals(mod(-20, 6), -2));
        System.out.println("#7  Testing mod(-20, 1):\t" + assertEquals(mod(-20, 1), 0));

        // Borders
        System.out.println("#8  Testing mod(Integer.MAX_VALUE, Integer.MAX_VALUE):\t" + assertEquals(mod(Integer.MAX_VALUE, Integer.MAX_VALUE), 0));

        // Divider == 0;
        System.out.println("#9  Testing mod(Integer.MAX_VALUE, 0):\t" + assertEquals(mod(Integer.MAX_VALUE, 0), Integer.MAX_VALUE));

        System.out.println("#10 Testing mod(-55, 5):\t" + assertNotEquals(mod(-55, 5), 10));
        System.out.println("#11 Testing mod(Integer.MAX_VALUE, 10):\t" + assertNotEquals(mod(Integer.MAX_VALUE, 10), 0));
    }
}
