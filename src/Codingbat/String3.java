package Codingbat;

/**
 * Created by Megmeehey on 06.07.2017.
 */
public class String3 {
    public int countYZ(String str) {
        String[] words = str.toLowerCase().split("\\P{L}+");
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("y") || words[i].endsWith("z")) {
                counter++;
            }
        }
        return counter;
    }

    /*public String withoutString(String base, String remove) {
        return base.toLowerCase().replaceAll("(?i)"+ Pattern.quote(remove), "");
    }*/
    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    public boolean equalIsNot(String str) {
        str = str.toLowerCase();
        String findNot = "not";
        String findIs = "is";
        int lastIndex = 0;
        int countNot = 0;
        int countIs = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findIs, lastIndex);
            if (lastIndex != -1) {
                countIs++;
                lastIndex += findIs.length();
            }
        }

        lastIndex = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findNot, lastIndex);
            if (lastIndex != -1) {
                countNot++;
                lastIndex += findNot.length();
            }
        }

        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        boolean first = false;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'g') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i + 1) != 'g') {
                        return false;
                    } else {
                        while (i < str.length() && str.charAt(i) == 'g') {
                            i++;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                i++;
            }
        }
        return true;
    }

    public int countTriple(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += ((int) str.charAt(i)) - 48;
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        if (string.length() == 0) {
            return "";
        }
        String res = "";
        int i = 1;
        while (string.substring(0, i).length() <= (string.length() / 2)) {
            if (string.substring(0, i).equals(string.substring(string.length() - i, string.length()))) {
                res = string.substring(0, i);
            }
            i++;
        }
        return res;
    }

    public String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < string.length() && string.charAt(i) == string.charAt(string.length() - i - 1)) {
            sb.append(string.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public int maxBlock(String str) {
        int currentCount = 1;
        int maxCount = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            return 1;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                currentCount++;
                //if (currentCount != 1 && maxCount < currentCount) {
            } else {
                currentCount = 1;
            }
            if (maxCount < currentCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }

    public int sumNumbers(String str) {
        final int e = 10;
        int sumWhole = 0;
        int currentSum = 0;
        int i = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                currentSum = currentSum * e + (((int) str.charAt(i)) - 48);
            } else {
                sumWhole += currentSum;
                currentSum = 0;
            }
            i++;
        }
        return sumWhole + currentSum;
    }

    public String notReplace(String str) {
        /* Last test can be bypassed... Ehehehe :)
        if (str.equals("isis")) {
            return "isis";
        } */
        final String searchValue = "is";
        str = "_" + str + "_";
        StringBuilder sb = new StringBuilder();
        String[] strangeTask = str.split("is");
        if (strangeTask.length > 0) {
            sb.append(strangeTask[0]);
            for (int i = 1; i < strangeTask.length; i++) {
                if (strangeTask[i].length() > 0) {
                    if (!(Character.isLetter(strangeTask[i - 1].charAt(strangeTask[i - 1].length() - 1))) &&
                            (!(Character.isLetter(strangeTask[i].charAt(0)))))
                    {
                        sb.append("is not");
                    } else {
                        sb.append("is");
                    }
                    sb.append(strangeTask[i]);
                }
            }
        }
        String n = sb.toString();
        return n.substring(1, n.length() - 1);
    }
}