package lesson170809;

import lesson170809.Dictionary.Pair;

public class UseDictionary {

    public static void main(String[] args) {

        Dictionary<String, String> d = new Dictionary();

        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");
        d.put("Петя", "Москва");
        d.put("Боря", "Москва");
        d.put("Оля", "Москва");
        d.put("Жанна", "Москва");
        d.put("Маша", "Москва");
        d.put("Вано", "Москва");

        System.out.println(d.get("Ann"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Вася"));

        d.put("Вася", "Петербург");
        System.out.println(d.get("Вася"));

        for (Object pair : d) {
            Pair<String, String> p = (Pair<String, String>) pair;
            System.out.println(p.key + " : " + p.value);
        }

        Dictionary<Integer, Character> awwwww = new Dictionary();

        awwwww.put(41, 'a');
        awwwww.put(42, 'b');
        awwwww.put(43, 'c');
        awwwww.put(44, 'e');
        awwwww.put(45, 'e');

        System.out.println(awwwww.get(42));
        System.out.println(awwwww.get(45));

        awwwww.put(44, 'd');

        for (Object pair : awwwww) {
            Pair<Integer, Character> p = (Pair<Integer, Character>) pair;
            System.out.println(p.key + " : " + p.value);
        }
    }

}
