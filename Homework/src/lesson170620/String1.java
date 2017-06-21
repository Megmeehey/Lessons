package lesson170620;

/**
 * Created by Megmeehey on 21.06.17.
 * Codingbat.com String-1 code practice at
 * http://codingbat.com/java/String-1
 */
public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        if (out.length() == 0) {
            return word;
        }
        else {
            return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
        }
    }

    public String extraEnd(String str) {
        String ls = str.substring(str.length() - 2, str.length());
        return ls + ls + ls;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        else {
            return str.substring(0, 2);
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        if (str.length() < 3) {
            return "";
        }
        else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        else {
            return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() < 3) {
            return str;
        }
        else {
            return str.substring(2) + str.substring(0, 2);
        }
    }

    public String right2(String str) {
        if (str.length() < 3) {
            return str;
        }
        else {
            return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
        }
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        else {
            return str.substring(str.length() - 1, str.length());
        }
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(str.length() - 2, str.length()).equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if ((index > str.length() - 2) || (index < 0)) {
            return str.substring(0, 2);
        }
        else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        else if (str.startsWith("bad") || str.substring(1, str.length()).startsWith("bad")) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }
        else if (str.length() == 1) {
            return str + "@";
        }
        else {
            return str.substring(0, 2);
        }
    }

    public String lastChars(String a, String b) {
        String r = "";
        if (a.length() < 1) {
            r += "@";
        }
        else {
            r += a.charAt(0);
        }
        if (b.length() < 1) {
            r += "@";
        }
        else {
            r += b.charAt(b.length() - 1);
        }
        return r;
    }

    public String conCat(String a, String b) {
        if ((a.length() < 1) || (b.length() < 1)) {
            return a + b;
        }
        else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1, b.length());
        }
        else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        int l = str.length();
        if (str.length() < 2) {
            return str;
        }
        else {
            return str.substring(0, l - 2) + str.charAt(l - 1) + str.charAt(l - 2);
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        else if (str.startsWith("blue")) {
            return "blue";
        }
        else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return true;
        }
        else {
            return false;
        }
    }

    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        }
        else {
            return a + b.substring(b.length() - a.length(), b.length());
        }
    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        else if (str.length() == 2) {
            return "";
        }
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());
        }
        else {
            return str;
        }
    }

    public String deFront(String str) {
        StringBuilder sb = new StringBuilder("");
        if (str.length() == 1) {
            if (str.charAt(0) == 'a') {
                sb.append("a");
            }
        }
        else if (str.length() == 2) {
            if (str.charAt(0) == 'a') {
                sb.append("a");
            }
            if (str.charAt(1) == 'b') {
                sb.append("b");
            }
        }
        else {
            if (str.charAt(0) == 'a') {
                sb.append("a");
            }
            if (str.charAt(1) == 'b') {
                sb.append("b");
            }
            sb.append(str.substring(2, str.length()));
        }
        return sb.toString();
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        if (word.length() == 1) {
            return str.substring(0, 1);
        }
        else if (str.substring(1, str.length()).startsWith(word.substring(1, word.length()))) {
            return str.substring(0, word.length());
        }
        else {
            return "";
        }
    }

    public String withoutX(String str) {
        StringBuilder sb = new StringBuilder("");
        if (str.length() == 0) {
            return "";
        }
        else if (str.length() == 1) {
            if (str.charAt(0) != 'x') {
                sb.append(str);
            }
        }
        else if (str.length() == 2) {
            if (str.charAt(0) != 'x') {
                sb.append(str.substring(0, 1));
            }
            if (str.charAt(1) != 'x') {
                sb.append(str.substring(1, 2));
            }
        }
        else {
            if (str.charAt(0) != 'x') {
                sb.append(str.substring(0, 1));
            }

            sb.append(str.substring(1, str.length() - 1));

            if (str.charAt(str.length() - 1) != 'x') {
                sb.append(str.substring(str.length() - 1, str.length()));
            }
        }
        return sb.toString();
    }

    public String withoutX2(String str) {
        StringBuilder sb = new StringBuilder("");
        if (str.length() == 0) {
            return "";
        }
        else if (str.length() == 1) {
            if (str.charAt(0) != 'x') {
                sb.append(str);
            }
        }
        else if (str.length() == 2) {
            if (str.charAt(0) != 'x') {
                sb.append(str.substring(0, 1));
            }
            if (str.charAt(1) != 'x') {
                sb.append(str.substring(1, 2));
            }
        }
        else {
            if (str.charAt(0) != 'x') {
                sb.append(str.substring(0, 1));
            }

            if (str.charAt(1) != 'x') {
                sb.append(str.substring(1, 2));
            }

            sb.append(str.substring(2, str.length()));
        }
        return sb.toString();
    }

}
