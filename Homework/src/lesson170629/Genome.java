package lesson170629;

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

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(100);
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
    // private static void
}