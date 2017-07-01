package lesson170629;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Megmeehey on 29.06.2017.
 */
public class Genome {
    /*
    String AAACGTGACATAGCTGATCGATCGTAGCATCGAC...
    N = 100000
    W = 20
    Solutions:
    1) for for for
    2) Sort substrings length W
    3) HashSet
     */

    private static final int GENOME_SIZE = 300000;

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE);
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