package lesson170701.classwork;

import java.util.*;

/**
 * Created by Megmeehey on 29.06.2017.
 * Updated on 01.07.2017.
 */
public class Genome {
    // constants
    private static final int WORD_SIZE = 4;
    private static final int GENOME_SIZE = 50;
    private static final byte[] ALPHABET = new byte[]{'A', 'C', 'G', 'T'};

    /*
    String AAACGTGACATAGCTGATCGATCGTAGCATCGAC...
    N = 100000
    W = 20
    Solutions:
    1) for for for
    1.5) Sort substrings length W
    2) Sort substrings length W, but take care about memory
    3) HashSet
    */

    static class Word implements Comparable<Word> {
        byte[] data;
        int offset;

        public Word(byte[] data, int i) {
            this.data = data;
            offset = i;
        }

        @Override
        public int compareTo(Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - data[otherWord.offset + i];
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("");
            for (int i = this.offset; i < this.offset + WORD_SIZE; i++) {
                sb.append((char) this.data[i]);
            }
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Word word = (Word) o;
            for (int i = 0; i < WORD_SIZE; i++) {
                if (this.data[i + this.offset] != word.data[i + word.offset]) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = Byte.hashCode(this.data[this.offset]);

            for (int i = 1; i < WORD_SIZE; i++) {
                result = 31 * result + Byte.hashCode(this.data[this.offset + i]);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE, ALPHABET);
        for (byte b : data) {
            System.out.print((char) b);
        }
        System.out.println();

        // findDuplicatesFFF(data, WORD_SIZE);
        findDuplicatesSSWGood(data, WORD_SIZE);

        System.out.println("**************************");
        System.out.println();
        System.out.println("**************************");

        findDuplicatesHM(data, WORD_SIZE);
    }

    // Sedgewick introduction to programming in Java
    // Broad Institute pacard GitHub
    // + HW: 2D matrix check row for negative with "continue OUTER"
    // + Codingbat
    // + HashMap
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
                    } else {
                        currentPiece.append((char) data[j + l]);
                    }
                }
                if (found) {
                    System.out.println("Found: " + currentPiece.toString() + " at indexes (" + j + ") and (" + k + ")");
                }
            }
        }
    }

    // one-and-half solution
    private static void findDuplicatesSSW(byte[] data, int wordSize) {
        List<String> allWordsArray = new ArrayList<String>();
        for (int i = 0; i < data.length - wordSize; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = i; j < wordSize; j++) {
                sb.append((char) data[j]);
            }
            allWordsArray.add(sb.toString());
        }
        // Well, that's bad... Way too much memory with all these strings
    }

    // second solution
    private static void findDuplicatesSSWGood(byte[] data, int wordSize) {
        List<Word> list = new ArrayList<Word>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);

        // need this to check last word in list
        byte[] dummy = new byte[] {'N', 'O', 'T', 'E', 'Q', 'A', 'L', 'S'};
        list.add(new Word(dummy, 1));

        int numOfInstances = 0;
        List<Integer> offsets = new ArrayList<Integer>();
        boolean start = true;
        Word previousWord;
        Word currentWord;
        int prnt = 1;

        for (int i = 1; i < list.size(); i++) {
            previousWord = list.get(i - 1);
            currentWord = list.get(i);
            if (offsets.size() == 0) {
                offsets.add(previousWord.offset);
            }
            if (currentWord.equals(previousWord)) {
                offsets.add(currentWord.offset);
            } else {
                if (offsets.size() != 1) {
                    System.out.println("#" + prnt + " " + previousWord.toString() + " appears " + offsets.size() + " times at " + offsets.toString());
                    offsets.clear();
                    prnt++;
                } else {
                    /*
                    System.out.println("#" + prnt + " " + previousWord.toString());
                    prnt++;
                    */
                    offsets.clear();
                }
            }
        }
    }

    // third solution
    private static void findDuplicatesHM(byte[] data, int wordSize) {
        Map<Word, List<Integer>> map = new HashMap<Word, List<Integer>>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            Word currentWord = new Word(data, i);
            List<Integer> offsets = map.get(currentWord);
            if (offsets == null) {
                offsets = new ArrayList<Integer>();
                offsets.add(1);
                offsets.add(currentWord.offset);
                map.put(currentWord, offsets);
            }
            else {
                offsets.set(0, offsets.get(0) + 1);
                offsets.add(currentWord.offset);
            }
        }

        printMap(map);
    }

    public static void printMap(Map<Word, List<Integer>> map) {
        int prnt = 1;
        for (Map.Entry<Word, List<Integer>> entry : map.entrySet()) {
            List<Integer> ls = entry.getValue();
            if (ls.get(0) == 1) {
                /*
                System.out.println("#" + prnt + " " + entry.getKey().toString());
                prnt++;
                */
            }
            else {
                System.out.println("#" + prnt + " " + entry.getKey().toString() + " appears " + ls.get(0) + " times at " + ls.subList(1, ls.size()).toString());
                prnt++;
            }
        }
    }
}