package lesson170823.homework;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class FriquencyAnalysis {
    public static void main(String[] args)
    {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        List<String> wordList = new LinkedList<>();

        String strToSplit = "Lorem ipsum dolor sit amet consetetur iam nonumy sadipscing " +
                "elitrs sed diam nonumy eirmod tempor invidunt ut erat sed " +
                "labore et dolore magna dolor sit amet aliquyam erat sed diam";


        for (String str : strToSplit.split(" "))
        {
            wordList.add(str);
        }

        // So, now we have list of words. It's unnecessary operation, since strToSplit.split
        // basically gives us same list.

        for (String str : wordList) {
            wordCounts.putIfAbsent(str, 0);
            wordCounts.computeIfPresent(str, (k,v) -> v+1);
        }

        System.out.println(wordCounts);
    }
}
