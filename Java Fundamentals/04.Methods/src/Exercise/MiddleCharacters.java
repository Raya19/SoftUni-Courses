package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printsMiddleCharacter(text);
    }

    public static void printsMiddleCharacter (String text) {


            if (text.length() % 2 != 0) {

                int middleCharacter = text.length() / 2;

                System.out.println(text.charAt(middleCharacter));
            }

            else {

                int firstMiddleCharacter = text.length() / 2 - 1;
                int secondMiddleCharacter = text.length() / 2;

                System.out.print(text.charAt(firstMiddleCharacter));
                System.out.println(text.charAt(secondMiddleCharacter));
        }

    }
}
