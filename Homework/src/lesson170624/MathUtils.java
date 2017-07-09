package lesson170624;

/**
 * Created by Megmeehey on 24.06.17.
 */

public class MathUtils {
    public static int max(int firstNum, int secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
    }

    public static int min(int firstNum, int secondNum) {
        return firstNum > secondNum ? secondNum : firstNum;
    }

    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int mod(int numerator, int divisor) { // throws IllegalArgumentException {
        if (divisor == 0) {
            // throw new IllegalArgumentException("Argument 'divisor' is 0");
            System.err.println("Argument 'divisor' is 0");
            return Integer.MAX_VALUE;
        }
        return numerator - ((int) numerator / divisor) * divisor;
    }

    /*
    public static int mod (int numerator, int divisor) {
        if (divisor == 0) {
            return Integer.MIN_VALUE;
            // Should I just try to divide and catch exception?
        }
        return remainder(divisor + remainder(numerator, divisor), divisor);
    }
    */

    public static boolean isPrime(int number) {
        // First, checking if number is even, and != 2;
        if (number <= 1) {
            return false;
        }
        if (number > 2 && (number & 1) == 0) {
            return false;
        }
        // If it isn't, checking further
        int boundary = (int) Math.sqrt(number);
        for (int i = 3; i <= boundary; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isFibonacci(int number) {
        // Assuming the first two numbers in the Fibonacci sequence are 0 and 1.
        // Assuming our sequence isn't bidirectional
        // BTW, probably can be upgraded by adding array to store fibonacci sequence and searching through
        long fibCurrent = 1;
        long fibPrevious = 0;
        long buffer = 0;

        if (number < 0) {
            return false;
        }
        else if (number == 0) {
            return true;
        }
        else {
            do {
                buffer = fibPrevious;
                fibPrevious = fibCurrent;
                fibCurrent = buffer + fibCurrent;
                /* compSequence[i] = fibCurrent; // here we can save already computed part of sequence
                   i++;
                */
            }
            while (fibCurrent < number);
        }

        if (fibCurrent == number) {
            return true;
        }
        else {
            return false;
        }
    }
}
