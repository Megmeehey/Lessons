package lesson170620;

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
        }
        else if ((speed > 60) && (speed < 81)) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        if (a + b > 9 && a + b < 20) {
            return 20;
        }
        else {
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
        }
        else {
            return weekday;
        }
    }
}
