package Task.two;

import java.util.*;



public class Task2 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Good ");
        text.add("Good morning");
        text.add("Good bye Div academy");

        Map<String, Integer> wordCounts = getWordCounts(text);

        for (String sentence : text) {
            int count = wordCounts.get(sentence);
            System.out.println("text: " + sentence);
            System.out.println("Word Count: " + count);
            System.out.println();
        }
    }

    public static Map<String, Integer> getWordCounts(List<String> sentences) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            wordCounts.put(sentence, words.length);
        }

        return wordCounts;
    }
}