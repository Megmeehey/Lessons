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
        dataArray[size++] = item;
    }

    public String toString() {
        return Arrays.toString(dataArray);
    }
}

