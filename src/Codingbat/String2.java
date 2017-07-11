package Codingbat;

/**
 * Created by Megmeehey on 06.07.2017.
 * Codingbat.com String-2 code practice at
 * http://codingbat.com/java/String-2
 */
public class String2 {
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        char currentChar;
        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            sb.append(currentChar);
            sb.append(currentChar);
        }
        return sb.toString();
    }

    public int countHi(String str) {
        final String SEARCHVALUE = "hi";

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(SEARCHVALUE, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += SEARCHVALUE.length();
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        final String SEARCHCAT = "cat";
        final String SEARCHDOG = "dog";
        int numOfCats = 0;
        int numOfDogs = 0;
        int lastIndexCat = 0;
        int lastIndexDog = 0;

        while (lastIndexCat != -1) {

            lastIndexCat = str.indexOf(SEARCHCAT, lastIndexCat);

            if (lastIndexCat != -1) {
                numOfCats++;
                lastIndexCat += SEARCHCAT.length();
            }
        }


        while (lastIndexDog != -1) {

            lastIndexDog = str.indexOf(SEARCHDOG, lastIndexDog);

            if (lastIndexDog != -1) {
                numOfDogs++;
                lastIndexDog += SEARCHDOG.length();
            }
        }
        return numOfCats == numOfDogs;
    }

    public int countCode(String str) {
        final String SEARCHVALUE = "co";
        int countOccurences = 0;
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (str.length() > index + 3) {
                if (str.charAt(index + 3) == 'e') {
                    countOccurences++;
                }
            }
        }
        return countOccurences;
    }

    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    public boolean xyzThere(String str) {
        final String SEARCHVALUE = "xyz";
        int countOccurences = 0;
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (index - 1 >= 0) {
                if (!(str.charAt(index - 1) == '.')) {
                    countOccurences++;
                    break;
                }
            } else {
                countOccurences++;
                break;
            }
        }
        return countOccurences > 0;
    }

    public boolean bobThere(String str) {
        final String SEARCHVALUE = "b";
        int countOccurences = 0;
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (str.length() > index + 2) {
                if (str.charAt(index + 2) == 'b') {
                    countOccurences++;
                    break;
                }
            }
        }
        return countOccurences > 0;
    }

    public boolean xyBalance(String str) {
        boolean hasX = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                hasX = true;
            }
            if (hasX && str.charAt(i) == 'y') {
                hasX = false;
            }
        }
        return !hasX;
    }

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int minln = Math.min(a.length(), b.length());
        int maxln = Math.max(a.length(), b.length());
        for (int i = 0; i < minln; i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > b.length()) {
            sb.append(a.substring(minln, maxln));
        } else {
            sb.append(b.substring(minln, maxln));
        }
        return sb.toString();
    }

    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String end = str.substring(str.length() - n, str.length());
        for (int i = 0; i < n; i++) {
            sb.append(end);
        }
        return sb.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        char[] front = new char[n];
        for (int i = 0; i < n; i++) {
            front[i] = str.charAt(i);
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append(front[j]);
            }
        }
        return sb.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        for (int i = 1; i < count; i++) {
            sb.append(sep).append(word);
        }
        return sb.toString();
    }

    public boolean prefixAgain(String str, int n) {
        return str.substring(n, str.length()).indexOf(str.substring(0, n)) > -1;
    }

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        final String SEARCHVALUE = "xyz";
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (Math.abs(index - (str.length() - index - 3)) <= 1) {
                return true;
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        final String SEARCHVALUE = "bread";
        int firstIndex = -1;
        int lastIndex = -1;
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (firstIndex == -1) {
                firstIndex = index;
            } else {
                lastIndex = index;
            }
        }
        if (firstIndex == -1 || lastIndex == -1) {
            return "";
        }
        return str.substring(firstIndex + 5, lastIndex);
    }

    public boolean sameStarChar(String str) {
        final String SEARCHVALUE = "*";
        for (int index = str.indexOf(SEARCHVALUE); index >= 0; index = str.indexOf(SEARCHVALUE, index + 1)) {
            if (index >= 1 && index < str.length() - 1) {
                if (!(str.charAt(index - 1) == str.charAt(index + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.append(str.charAt(i + 1)).append(str.charAt(i + 2)).append(str.charAt(i));
        }
        return sb.toString();
    }

    public String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length() - 2) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sb.append('z').append('p');
                i += 3;
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        while (i < str.length()) {
            sb.append(str.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public String starOut(String str) {
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (str.charAt(i) == '*') {
            i += 2;
        }
        while (i < str.length() - 1) {
            if (str.charAt(i + 1) == '*') {
                int j = 2;
                while (i + j < str.length() && str.charAt(i + j) == '*') {
                    j++;
                }
                i += j;
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        if (i < str.length() && str.charAt(i) != '*') {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int index = str.indexOf(word); index >= 0; index = str.indexOf(word, index + 1)) {
            while (i < index) {
                sb.append('+');
                i++;
            }
            sb.append(word);
            i += word.length();
        }
        while (i < str.length()) {
            sb.append('+');
            i++;
        }
        return sb.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int index = str.indexOf(word); index >= 0; index = str.indexOf(word, index + 1)) {
            if (index - 1 >= 0) {
                sb.append(str.charAt(index - 1));
            }
            if (index + word.length() < str.length()) {
                sb.append(str.charAt(index + word.length()));
            }
        }
        return sb.toString();
    }
}
