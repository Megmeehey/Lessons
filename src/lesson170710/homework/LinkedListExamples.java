package lesson170710.homework;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<String> doublyLinked = new ArrayList<>();
        SinglyLinkedList<String> singlyLinked = new SinglyLinkedList();

        System.out.println("Reference: ");
        process(doublyLinked);
        System.out.println();
        System.out.println("Actual: ");
        process(singlyLinked);


    }

    private static void process(List<String> list) {
        System.out.println("Is list empty now? " + list.isEmpty());

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        System.out.println("And now? " + list.isEmpty());
        System.out.println("Size of this " + list + " list = " + list.size());

        list.add("seven");
        list.add("eight");
        list.add("nine");

        System.out.println("Added three more elements. List now:");
        System.out.println(list.toString() + " and size = " + list.size());

        System.out.println("Third element = " + list.get(3));
        System.out.println("Sixth element = " + list.get(6));

        System.out.println("List contains ten? " + list.contains("ten"));
        list.add("ten");
        System.out.println("Now? " + list.contains("ten"));

        list.remove("ten");
        System.out.println("And now? " + list.contains("ten"));
        list.remove("one");
        list.remove(1);
        System.out.println("List elements now: " + list);
    }

    private static void process(SinglyLinkedList<String> list) {
        System.out.println("Is list empty now? " + list.isEmpty());

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        System.out.println("And now? " + list.isEmpty());
        System.out.println("Size of this " + list + " list = " + list.size());

        list.add("seven");
        list.add("eight");
        list.add("nine");

        System.out.println("Added three more elements. List now:");
        System.out.println(list.toString() + " and size = " + list.size());

        System.out.println("Third element = " + list.get(3));
        System.out.println("Sixth element = " + list.get(6));

        System.out.println("List contains ten? " + list.contains("ten"));
        list.add("ten");
        System.out.println("Now? " + list.contains("ten"));

        list.remove("ten");
        System.out.println("And now? " + list.contains("ten"));
        list.remove("one");
        list.remove(1);
        System.out.println("List elements now: " + list);
    }
}