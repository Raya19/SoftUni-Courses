package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            checkPalindrome(command);

            command = scanner.nextLine();

        }

    }

    public static void checkPalindrome(String command) {


        String reverseCommand = "";

        for (int i = command.length() - 1; i >= 0; i--) {

            char symbol = command.charAt(i);
            reverseCommand += symbol;


        }

        if (!reverseCommand.equals(command)) {

            System.out.println("false");


        } else {

            System.out.println("true");
        }


    }


}


