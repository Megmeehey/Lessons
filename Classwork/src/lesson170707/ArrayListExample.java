package lesson170707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Megmeehey on 07.07.2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<String>();

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");
        listOfStrings.add("five");

        System.out.println(listOfStrings);

        Collections.sort(listOfStrings);

        System.out.println(listOfStrings);
    }
}
