package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder textBuilder = new StringBuilder(text);

        int totalStrength = 0;

        for (int i = 0; i < textBuilder.length(); i++) {

            char symbol = textBuilder.charAt(i);

            if (symbol == '>') {

                int explosion = Integer.parseInt(textBuilder.charAt(i + 1) + "");
                totalStrength += explosion;


            }
            else if (symbol != '>' && totalStrength > 0) {

                textBuilder.deleteCharAt(i);
                totalStrength--;
                i--;
            }

        }

        System.out.println(textBuilder);
    }
}
