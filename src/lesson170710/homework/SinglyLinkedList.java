package lesson170710.homework;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements Iterable<E> {
    private static final String DELIMITER = ", ";
    private static final String OPENINGBRACKET = "[";
    private static final String CLOSINGBRACKET = "]";

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        head = null;
    }

    public void add(String value) {
        Node node = new Node(value, null);

        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }

        this.tail = node;
        size++;
    }

    public boolean contains(E value) {
        for (E temp : this)
            if(temp.equals(value)) {
                return true;
            }

        return false;
    }

    public E get(int indexAt) {
        if (head == null) throw new IndexOutOfBoundsException();

        Node<E> current = head;
        for (int i = 0; i < indexAt; i++) {
            current = current.getNext();
        }

        if (current == null) throw new IndexOutOfBoundsException();

        return current.getValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OPENINGBRACKET);

        Node current = this.head;
        if (current != null) {
            sb.append(current.getValue().toString());
        }

        while (current.getNext() != null) {
            current = current.getNext();
            sb.append(DELIMITER);
            sb.append(current.getValue().toString());
        }
        sb.append(CLOSINGBRACKET);

        return sb.toString();
    }

    public boolean remove(String value) {
        if (value == null) {
            return false;
        }

        boolean result = false;
        Node current = this.head;
        Node previous = null;

        while (current != null) {
            if (current.getValue().equals(value)) {
                if (previous == null) {
                    head = current.getNext();
                } else  {
                    previous.setNext(current.getNext());
                }
                size--;
                result = true;
                break;
            }
            previous = current;
            current = current.getNext();
        }

        if (head == null) {
            tail = null;
        }

        return result;
    }

    public boolean remove(int index) {
        if (this.head == null) {
            return false;
        }

        boolean result = false;
        Node current = this.head;
        int count = 0;
        Node previous = null;

        while (current != null) {
            if (count >= index) {
                if (previous == null) {
                    head = current.getNext();
                } else  {
                    previous.setNext(current.getNext());
                }
                size--;
                result = true;
                break;
            }
            count++;
            previous = current;
            current = current.getNext();
        }

        if (head == null) {
            tail = null;
        }

        return result;
    }

    public Iterator<E> iterator()
    {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E>
    {
        private Node<E> nextNode;

        public LinkedListIterator()
        {
            nextNode = head;
        }

        public boolean hasNext()
        {
            return nextNode != null;
        }

        public E next()
        {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E res = nextNode.getValue();
            nextNode = nextNode.getNext();
            return res;
        }

        // IDK if I need to implement this
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}