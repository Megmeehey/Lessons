package lesson170712.homework;

import java.util.Arrays;

/**
 * Created by megmeehey on 14.07.17.
 */
public class Stack<E> {
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

    public E peek() {
        return elementAt(size() - 1);
    }

    public boolean removeElementAt(int i) {
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

    public E elementAt(int i) {
        return (E) dataArray[i];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return dataArray.length;
    }

    public boolean empty() {
        return size() == 0;
    }

    public String toString() {
        return Arrays.toString(dataArray);
    }
}

