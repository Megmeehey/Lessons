package lesson170624.classwork;

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

    //public static int remainder (int divident, int divisor) {
    public static int mod (int divident, int divisor) {
        if (divisor == 0) {
            return Integer.MIN_VALUE;
        }
        return divident - ((int) divident / divisor) * divisor;
    }

    /*
    public static int mod (int divident, int divisor) {
        if (divisor == 0) {
            return Integer.MIN_VALUE;
        }
        return remainder(divisor + remainder(divident, divisor), divisor);
    }
    */

    public static boolean isPrime(int number) {
        //TODO
        return false;
    }

    public static boolean isFibonacci(int number) {
        if (number == 1) {
            return true;
        }
        else {
            int fibCurrent = 1;
            int fibNext = 1;
            int buffer = 0;

            while (fibCurrent < number) {
                buffer = fibCurrent;
                fibNext += fibCurrent + fibNext;
            }
        }
        return false;
    }
}
