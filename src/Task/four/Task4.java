package Task.four;

import java.util.*;

public class Task4 {
    public static <T> Collection<T> getUniqueElements(Collection<T> collection) {
        Set<T> uniqueSet = new HashSet<>(collection);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(34);
        numbers.add(26);
        numbers.add(32);
        numbers.add(43);
        numbers.add(41);
        numbers.add(55);

        Collection<Integer> uniqueNumbers = getUniqueElements(numbers);

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}