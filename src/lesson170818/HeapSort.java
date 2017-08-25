package lesson170818;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();


        list.add("one");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("ten");
        list.add("thousand");
        list.add("hundred");

        List<String> sorted = heapSort(list);

        list.forEach(System.out::println);

        System.out.println(sorted);
    }

    private static List<String> heapSort(List<String> heap) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        for (String string: heap) {
            pq.add(string);
        }

        List<String> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
}