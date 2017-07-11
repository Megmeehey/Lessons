package Codingbat;

/**
 * Created by Megmeehey on 20.06.17.
 * Codingbat.com Warmup-1 code practice at
 * http://codingbat.com/java/Warmup-1
 */

public class Warmup {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        else
        {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n >= 21) {
            return 2 * (n - 21);
        }
        else {
            return 21 - n;
        }

    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && ((hour < 7) || (hour > 20));
    }

    public boolean makes10(int a, int b) {
        return ((a == 10) || (b == 10) || (a + b == 10));
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) < 11) || (Math.abs(200 - n) < 11);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0) && (b < 0);
        }
        else {
            return ((a < 0) && (b > 0)) || ((a > 0) && (b < 0));
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();
    }

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        else if (str.length() == 2) {
            return str.substring(1, 2) + str.substring(0, 1);
        }
        else {
            return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length());
        }
        else {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

    public String backAround(String str) {
        return str.substring(str.length() - 1, str.length()) + str + str.substring(str.length() - 1, str.length());
    }

    public boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5) == 0);
    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str.substring(0, str.length()) + str + str.substring(0, str.length());
        }
        else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (9 < a && a < 21) || (9 < b && b < 21);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (12 < a && a < 20) || (12 < b && b < 20) || (12 < c && c < 20);
    }

    public boolean loneTeen(int a, int b) {
        return (12 < a && a < 20) ^ (12 < b && b < 20);
    }

    public String delDel(String str) {
        if ((str.length() > 3) && (str.substring(1,4).equals("del"))) {
                return str.substring(0, 1) + str.substring(4);
            }
            else {
                return str;
            }
    }

    public boolean mixStart(String str) {
        return (str.length() > 2) && (str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("o")) {
            sb.append("o");
        }
        if (str.length() > 1 && str.substring(1, 2).equals("z")) {
            sb.append("z");
        }
        return sb.toString();
    }

    public int intMax(int a, int b, int c) {
        if ((a >= b) && (a >= c)) {
            return a;
        }
        else if ((b >= a) && (b >= c)) {
            return b;
        }
        else {
            return c;
        }
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        }
        else if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        }
        else {
            return a;
        }
    }

    public boolean in3050(int a, int b) {
        return ((29 < a && a < 41) && (29 < b && b < 41)) || ((39 < a && a < 51) && (39 < b && b < 51));
    }

    public int max1020(int a, int b) {
        if ((9 < a && a < 21)) {
            if ((9 < b && b < 21)) {
                if (b >= a) {
                    return b;
                }
                else {
                    return a;
                }
            }
            else {
                return a;
            }
        }
        else if ((9 < b && b < 21)) {
            return b;
        }
        else {
            return 0;
        }
    }

    public boolean stringE(String str) {
        int numOfE = str.length() - str.replace("e", "").length();
        return ((numOfE > 0) && (numOfE < 4));
    }

    public boolean lastDigit(int a, int b) {
        return ((a % 10) == (b % 10));
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        else {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
    }

    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        int i = 0, l = str.length();
        while (i < l) {
            sb.append(str.charAt(i));
            i += n;
        }
        return sb.toString();
    }
}
