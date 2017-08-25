package lesson170825.classwork;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        String[] words = { "hello", "world" };

        StringBuilder sb = new StringBuilder();

        String s = "";
        s.chars();

        for (String word: words) {
            sb.append(word);
        }

        List<Character> distinctChars
                = sb.chars()                    // get chars as ints
                .distinct()                     // remove duplicates
                .sorted()                       // sort
                .mapToObj(c -> (char) c)        // convert int to Character
                .collect(Collectors.toList());  // collect in a List

        System.out.println(distinctChars);
    }
}
