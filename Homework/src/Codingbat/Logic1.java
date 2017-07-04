package Codingbat;

/**
 * Created by Megmeehey on 22.06.17.
 * Codingbat.com Logic-1 code practice at
 * http://codingbat.com/java/Logic-1
 */
public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (39 < cigars) && (isWeekend || cigars < 61);
    }

    public int dateFashion(int you, int date) {
        if ((you < 3) || (date < 3)) {
            return 0;
        }
        if ((you > 7) || (date > 7)) {
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int topBorder = 0;
        topBorder = (isSummer) ? 101 : 91;
        return (59 < temp) && (temp < topBorder);
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        speed = (isBirthday) ? speed - 5 : speed;
        if (speed < 61) {
            return 0;
        } else if ((speed > 60) && (speed < 81)) {
            return 1;
        } else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        if (a + b > 9 && a + b < 20) {
            return 20;
        } else {
            return a + b;
        }
    }

    public String alarmClock(int day, boolean vacation) {
        String weekday = "7:00", weekend = "10:00";
        if (vacation) {
            weekday = weekend;
            weekend = "off";
        }
        if (day == 0 || day == 6) {
            return weekend;
        } else {
            return weekday;
        }
    }

    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public boolean specialEleven(int n) {
        int modulo = n % 11;
        return modulo == 0 || modulo == 1;
    }

    public boolean more20(int n) {
        int modulo = n % 20;
        return modulo == 1 || modulo == 2;
    }

    public boolean old35(int n) {
        boolean a = n % 3 == 0;
        boolean b = n % 5 == 0;
        return (a || b) && (a ^ b);
    }

    public boolean less20(int n) {
        int modulo = n % 20;
        return modulo == 19 || modulo == 18;
    }

    public boolean nearTen(int num) {
        int modulo = num % 10;
        return modulo == 2 || modulo == 8 || modulo == 1 || modulo == 0 || modulo == 9;
    }

    public int teenSum(int a, int b) {
        int result = 0;
        if (a >= 13 && a <= 19) {
            result = 19;
        }
        if (b >= 13 && b <= 19) {
            result = 19;
        }
        if (result == 0) {
            result = a + b;
        }
        return result;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean result;
        if (isAsleep) {
            return false;
        } else if (isMorning && isMom) {
            return true;
        } else if (isMorning) {
            return false;
        } else {
            return true;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 5 && candy >= 5 && (tea >= 2 * candy || candy >= 2 * tea)) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString(String str) {
        String res = "";
        if (str.charAt(0) == 'f') {
            res += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            res += "Buzz";
        }
        if (res.length() == 0) {
            res += str;
        }
        return res;
    }

    public String fizzString2(int n) {
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
        res += "!";
        return res;

    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (b > a || bOk) && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 % 6 + 1;
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return a < b ? a : b;
        } else {
            return a < b ? b : a;
        }
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        } else if (ab - 10 == bc || ab - 10 == ac) {
            return 5;
        } else {
            return 0;
        }
    }

}
