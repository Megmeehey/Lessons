package lesson170629.homework;

import java.util.ArrayList;
import java.util.List;

public class Genome {

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(300000);
        for (byte b : data) {
            System.out.print((char) b);
        }
        System.out.println();

        findDuplicatesFFF(data, 4);
    }

    // first solution
    private static void findDuplicatesFFF(byte[] data, int wordSize) {
        for (int j = 0; j < data.length - wordSize; j++) {
            INNER:
            for (int k = j + 1; k < data.length - wordSize + 1; k++) {
                boolean found = true;
                StringBuilder currentPiece = new StringBuilder("");
                for (int l = 0; l < wordSize; l++) {
                    if (data[j + l] != data[k + l]) {
                        found = false;
                        break;
                    }
                    else {
                        currentPiece.append((char) data[j + l]);
                    }
                }
                if (found) {
                    System.out.println("Found: " + currentPiece.toString() + " at indexes (" + j + ") and (" + k + ")");
                }
            }
        }
    }

    // second solution
    private static void findDuplicatesSSW(byte[] data, int wordSize) {
        List<String> allWordsArray = new ArrayList<String>();
        for (int i = 0; i < data.length - wordSize; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = i; j < wordSize; j++) {
                sb.append((char) data[j]);
            }
            allWordsArray.add(sb.toString());
        }
        // Well, that's bad... We take too much memory with all these strings

    }
    // private static void
}