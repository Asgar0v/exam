
package Task.five;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 6, 3, 7, 5, 6, 7, 8, 9, 10,8,5,6);

        int conclusion = number.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("conclusion : " + conclusion);
    }
}