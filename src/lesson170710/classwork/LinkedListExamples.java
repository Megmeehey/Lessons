package lesson170710.classwork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megmeehey on 10.07.17.
 */
public class LinkedListExamples {
    public static void main(String[] args) {
        List<String> listGood = new ArrayList<>();
        StringLinkedList listBad = new StringLinkedList();

        process(listGood);
        process(listBad);


    }

    private static void process(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);
    }

    private static void process(StringLinkedList list) {
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);
    }
}
