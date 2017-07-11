package lesson170710.classwork;

/**
 * Created by megmeehey on 10.07.17.
 */
public class StringLinkedList {
    private static final String DELIMITER = ", ";
    private static final String OPENINGBRACKET = "[";
    private static final String CLOSINGBRACKET = "]";
    Node first;
    Node last;
    private int size;

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.setNext(node);
        }

        this.last = node;

        size++;
    }

    public int size() {
        return this.size;
    }
    // HW: Instead of class of <E>, try to use array of <E>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OPENINGBRACKET);

        Node current = this.first;
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
        Node current = this.first;
        Node previous = null;

        while (current != null) {
            if (current.getValue().equals(value)) {
                if (previous == null) {
                    first = current.getNext();
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

        if (first == null) {
            last = null;
        }

        return result;
    }
    // HW: Implement remove by index number
}