package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {

            int number = i;

            printTopNumber(number);
        }
    }

    public static void printTopNumber(int number) {

        int originalValueOfNumber = number;

        int sum = 0;
        int countOddDigits = 0;

        while (number > 0) {

            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                countOddDigits++;
            }

            sum += lastDigit;

            number /= 10;
        }

        if (sum % 8 == 0 && countOddDigits >= 1) {

            System.out.println(originalValueOfNumber);
        }


    }
}
