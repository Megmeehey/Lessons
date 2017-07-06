package Codingbat;

import com.sun.deploy.util.StringUtils;

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

    }
}
