package Task.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Array:");
        List<String> myList = new ArrayList<>();
        myList.add(scanner.nextLine());
        myList.add(scanner.nextLine());
        myList.add(scanner.nextLine());
        myList.add(scanner.nextLine());
        List<String> output = filterStrings(myList);
        System.out.println(output);
    }

    public static List<String> filterStrings(List<String> myList) {
        List<String> output = new ArrayList<>();
        myList.stream()
                .filter(str -> str.length() <= 3)
                .forEach(output::add);
        return output;
    }
}


