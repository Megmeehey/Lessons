package lesson170707;

/**
 * Created by Megmeehey on 07.07.2017.
 */

import java.util.Arrays;

public class StringArrayList {
    private static final String DELIMITER = ", ";
    private static final String OPENINGBRACKET = "[";
    private static final String CLOSINGBRACKET = "]";
    static final int DEFAULT_SIZE = 2;

    String[] elements;
    int size;

    public StringArrayList() {
        this.elements = new String[DEFAULT_SIZE];
        this.size = 0;
    }

    public StringArrayList(String[] array) {
        this.elements = Arrays.copyOf(array, array.length);
        this.size = array.length;
        // TODO: Probably need to check if Strings in given array are null;
    }

    private void grow() {
        this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    // [a,b,c,d,e,f]
    //  0 1 2 3 4 5

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String get(int index) {
        if (size <= index) {
            return "null";
        } else {
            return this.elements[index];
        }
    }

    public boolean set(int index, String value) {
        if (size <= index) {
            return false;
        } else {
            this.elements[index] = value; // copy of?
            return true;
        }
    }

    public void add(String string) {
        if (size == elements.length) {
            grow();
        }

        elements[size++] = string;
//		size = size + 1;
    }

    @Override
    public String toString() {
        if (this.elements == null) {
            System.out.print("null");
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OPENINGBRACKET);
        for (int i = 0; i < this.elements.length; i++) {
            sb.append(this.elements[i]);
            if (i + 1 < this.elements.length) {
                sb.append(DELIMITER);
            }
        }
        sb.append(CLOSINGBRACKET);
        return sb.toString();
    }

    //  [a,b,c,d,e,_]
    //   0 1 2 3 4 5
    //  [a,b,d,e,_,_]
    //   0 1 2 3 4

    public boolean remove(int i) {
        if (i >= size || i < 0) {
            return false;
        }

        System.arraycopy(elements, i+1, elements, i, --size - i);
        elements[size] = null;
        return true;
    }

    public boolean remove(String value) {
        int i = 0;
        if (this.elements.length == 0 || value == null) {
            return false;
        }
        while (!value.equals(elements[i])) {
            i++;
        }

        System.arraycopy(elements, i+1, elements, i, --size - i);
        elements[size] = null;
        return true;
    }
}