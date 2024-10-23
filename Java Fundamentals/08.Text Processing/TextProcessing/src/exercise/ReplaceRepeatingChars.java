package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        StringBuilder newText = new StringBuilder(word);

        for (int i = 0; i < newText.length() - 1; i++) {

            if (newText.charAt(i) == newText.charAt(i + 1)) {

                newText.deleteCharAt(i);
                i--;

            }
        }

        System.out.println(newText);

    }
}

