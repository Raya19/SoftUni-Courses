package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f" ,calculateFactorial(firstNum) * 1.0 / calculateFactorial(secondNum));

    }

    public static long calculateFactorial (int number) {

        long fact = 1;

        for (int i = 1; i <= number; i++) {

            fact *= i;

        }

        return fact;
    }


}
