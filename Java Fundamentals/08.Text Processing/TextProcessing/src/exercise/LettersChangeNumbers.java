package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String code : text) {

            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;


        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code) {


        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble((code.substring(1, code.length() - 1)));

        if (Character.isUpperCase(firstLetter)) {

            int positionOfTheLetterInAlphabet = firstLetter - 64;

            number /= positionOfTheLetterInAlphabet;

        } else {

            int positionOfTheLetterInAlphabet = firstLetter - 96;

            number *= positionOfTheLetterInAlphabet;

        }


        if (Character.isUpperCase(lastLetter)) {

            int positionOfTheLetterInAlphabet = lastLetter - 64;

            number -= positionOfTheLetterInAlphabet;

        } else {

            int positionOfTheLetterInAlphabet = lastLetter - 96;

            number += positionOfTheLetterInAlphabet;


        }

        return number;

    }
}
