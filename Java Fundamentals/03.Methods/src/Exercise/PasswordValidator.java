package MethodsExercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean firstRule = from6to10characters(password);
        boolean secondRule = consistsOnlyOfLettersAndDigits(password);
        boolean thirdRule = haveAtLeast2Digits(password);


        if (firstRule && secondRule && thirdRule) {

            System.out.println("Password is valid");

        }

        if (!firstRule) {

            System.out.println("Password must be between 6 and 10 characters");

        }

        if (!secondRule) {

            System.out.println("Password must consist only of letters and digits");

        }

        if (!thirdRule) {

            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean from6to10characters(String password) {

        int count = 0;

        for (int i = 0; i <= password.length() - 1; i++) {

            count++;

        }

        if (count >= 6 && count <= 10) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean consistsOnlyOfLettersAndDigits(String password) {

        for (int i = 0; i <= password.length() - 1; i++) {

            char symbol = password.charAt(i);


            if (!Character.isLetterOrDigit(symbol)) {
                return false;


            }
        }

        return true;

    }


    public static boolean haveAtLeast2Digits(String password) {

        int count = 0;

        for (int i = 0; i <= password.length() - 1; i++) {

            char symbol = password.charAt(i);

            if (Character.isDigit(symbol)) {

                count++;
            }

        }

        if (count >= 2) {

            return true;

        } else {

            return false;
        }


    }
}