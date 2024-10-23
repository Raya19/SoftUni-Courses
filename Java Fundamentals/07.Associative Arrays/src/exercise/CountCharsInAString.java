package MapsExercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String input = scanner.nextLine().replaceAll(" ", "");

        Map<Character, Integer> countCharsInAString = new LinkedHashMap<>();

        for (char letter : input.toCharArray()) {


            if (countCharsInAString.containsKey(letter)) {

                countCharsInAString.put(letter, countCharsInAString.get(letter) + 1);

            }
            else {

                countCharsInAString.put(letter, 1);


            }


        }

        for (Map.Entry<Character, Integer> entry : countCharsInAString.entrySet()) {

            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
