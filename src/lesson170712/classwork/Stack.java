package lesson170712.classwork;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {
    private static final String DELIMITER = ", ";
    private static final String OPENINGBRACKET = "[";
    private static final String CLOSINGBRACKET = "]";
    static final int DEFAULT_MAX_SIZE = 3;

    private final Object[] dataArray;
    private int size;

    public Stack() {
        this.dataArray = new Object[DEFAULT_MAX_SIZE];
        this.size = 0;
    }

    public Stack(E[] array) {
        this.dataArray = Arrays.copyOf(array, array.length);
        this.size = array.length;
    }

    public Stack(int maxSize) {
        this.dataArray = new Object[maxSize];
        this.size = 0;
    }

    public void push(E item) {
        if (size >= dataArray.length) {
            throw new StackOverflowError();
        }
        dataArray[size++] = item;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return dataArray.length;
    }

    public E pop() {
        E dataItem;

        dataItem = peek();
        removeElementAt(size() - 1);

        return dataItem;
    }

    private boolean removeElementAt(int i) {
        if (i >= size || i < 0) {
            return false;
        }

        if (i == size - 1) {
            dataArray[--size] = null;
            return true;
        }

        System.arraycopy(dataArray, i+1, dataArray, i, --size - i);
        dataArray[size] = null;
        return true;
    }

    public E peek() {
        if (size() == 0) {
            throw new EmptyStackException();
        }
        return elementAt(size() - 1);
    }

    private E elementAt(int i) {
        return (E) dataArray[i];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        if (this.dataArray == null) {
            System.out.print("null");
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OPENINGBRACKET);
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.dataArray[i]);
            if (i + 1 < this.dataArray.length) {
                sb.append(DELIMITER);
            }
        }
        sb.append(CLOSINGBRACKET);
        return sb.toString();
    }
}