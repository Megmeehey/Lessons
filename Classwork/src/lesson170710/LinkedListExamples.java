package lesson170710;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megmeehey on 10.07.17.
 */
public class LinkedListExamples {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        process(list1);
        process(list2);
    }

    private static void process(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("three");


    }
}
