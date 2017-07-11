package lesson170624.homework;

/**
 * Created by Megmeehey on 24.06.17.
 */

public class MathUtils {
    /**
     * Returns the maximum of two int arguments;
     *
     * @param firstNum - first int value
     * @param secondNum - second int value
     * @return the max function of the arguments
     */
    public static int max(int firstNum, int secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
    }

    /**
     * Returns the minimum of two int arguments;
     *
     * @param firstNum - first int value
     * @param secondNum - second int value
     * @return the min function of the arguments
     */
    public static int min(int firstNum, int secondNum) {
        return firstNum > secondNum ? secondNum : firstNum;
    }

    /**
     * Returns the signum function of the argument;
     *
     * @param number - int value, which sign is to be returned
     * @return the signum function of the argument
     */
    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Returns the remainder after division of one number by another
     *
     * Special cases:
     * <ul><li>If the argument is zero, then the result is Integer.MAX_VALUE,
     * which is unreachable in normal conditions. Moreover, Syster.err stream
     * prints warning message.
     *
     * @param numerator - first number, divident
     * @param divisor - second number, divisor
     * @return remainder after division of numerator by divisor
     */
    public static int mod(int numerator, int divisor) { // throws IllegalArgumentException {
        if (divisor == 0) {
            // throw new IllegalArgumentException("Argument 'divisor' is 0");
            System.err.println("Argument 'divisor' is 0");
            return Integer.MAX_VALUE;
        }
        return numerator - (numerator / divisor) * divisor;
    }

    /* If we need same sign as the divisor
    public static int mod (int numerator, int divisor) {
        if (divisor == 0) {
            return Integer.MIN_VALUE;
            // Should I just try to divide and catch exception?
        }
        return remainder(divisor + remainder(numerator, divisor), divisor);
    }
    */

    /**
     * Checks if the given number is prime.
     *
     * @param number - int number to check
     * @return true, if number is prime. False otherwise.
     */
    public static boolean isPrime(int number) {
        // First, check if number is even, and != 2;
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

    /**
     * Checks if the given number belongs to Fibonacci sequence.
     * Assuming the first two numbers in the Fibonacci sequence are 0 and 1
     * and the sequence isn't bidirectional.
     *
     * @param number - int number to check
     * @return true, if number belongs to Fibonacci sequence. False otherwise.
     */
    public static boolean isFibonacci(int number) {
        // Probably can be upgraded by adding array to store fibonacci sequence and searching through
        long fibCurrent = 1;
        long fibPrevious = 0;
        long buffer;

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

        return fibCurrent == number;
    }
}