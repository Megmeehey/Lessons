package lesson170627.homework;

/**
 * Converter class. Converts decimal number to any base (up to 36)
 * Negative nums realised using sign, but not "two’s complement".
 * TODO: use two's complement
 * TODO: fix Integer.MIN trouble
 */

public class Converter {
    // Seems it's better to use simple array, than calculate needed char using int -> char conversion
    // Because (int) '9' = 57 and (int) 'A' = 65
    private static char symbols[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private static String ERROR_MESSAGE = "Current usable bases are between 2 and 36 inclusively";

    public static String getErrorMessage() {
        return ERROR_MESSAGE;
    }

    public String toString(int number, int base) {
        if (base > 36 || base < 2) {
            return ERROR_MESSAGE;
        }
        else {
            int sign = Integer.signum(number);
            if (sign == 0) {
                return Integer.toString(0);
            }
            else if (sign == -1) {
                return toString(Math.abs(number), base, "-", 0, 0, "");
            }
            else {
                return toString(Math.abs(number), base, "", 0, 0, "");
            }
        }
    }

    public String toBinaryString(int number) {
        return toString(number, 2);
    }

    public String toHexString(int number) {
        return toString(number, 16);
    }

    public String toOctalString(int number) {
        return toString(number, 8);
    }

    private String toString(long number, int base, String sign, int call, int position, String result) {
        if (number < Math.pow(base, position + 1)) {
            if (call == 0) {
                return sign + symbols[(int) (number / (int) Math.pow(base, position))] + result;
            }
            else {
                return symbols[(int) (number / (int) Math.pow(base, position))] + result;
            }
            // Is StringBuilder.append + reverse faster?
            // If it is, is there any good way to understand if it is the last call in stack, other than
            // to use one more parameter to track calls?
        } else {
            long remainder = (number % (int) Math.pow(base, position + 1));
            return toString(number - remainder, base, sign, call++,position + 1, symbols[(int) (remainder / (int) (Math.pow(base, position)))] + result);
        }
    }

    public String toString(String number, int base) {
        if (base > 36 || base < 2) {
            return ERROR_MESSAGE;
        }
        else {
            int currCharValue = 0;
            int result = 0;
            int pow = 0;
            int sign, border;
            String upNumber = number.toUpperCase();
            if (upNumber.charAt(0) == '-') {
                sign = -1;
                border = 1;
            }
            else {
                sign = 1;
                border = 0;
            }
            for (int i = upNumber.length() - 1; i >= border; i--) {
                char c = upNumber.charAt(i);
                if (c >= '0' && c <= '9') {
                    currCharValue = c - '0';
                } else if (c >= 'A' && c <= 'Z') {
                    currCharValue = 10 + (c - 'A');
                }
                result += currCharValue * Math.pow(base, pow);
                pow++;
            }
            result *= sign;
            return Integer.toString(result);
        }
    }

    public String toString(String number, int fromBase, int toBase) {
        return toString(Integer.parseInt(toString(number, fromBase)), toBase);
    }
}