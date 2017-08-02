package lesson170710.homework;

/**
 * Node class. Each of these stores data and link to next Node.
 * @param <E> - type of data to be stored at each Node
 */
class Node<E> {

    private E value;
    private Node<E> next;

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }
}