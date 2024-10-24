package MapsLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = Arrays.stream(scanner.nextLine().split(" "))
                         .filter(e -> e.length() % 2 == 0)
                         .toArray(String[]::new);


        for (String word : array) {

            System.out.println(word);

        }
    }
}
