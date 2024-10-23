package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        String[] firstArray = new String[n];
        String[] secondArray = new String[n];


        for (int i = 1; i <= n; i++) {

            String[] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];


            if (i % 2 == 0) {

                firstArray[i - 1] = secondNum;
                secondArray[i - 1] = firstNum;


            } else {

                firstArray[i - 1] = firstNum;
                secondArray[i - 1] = secondNum;

            }

        }

        for (String element : firstArray) {

            System.out.print(element + " ");

        }

        System.out.println();

        for (String element : secondArray) {

            System.out.print(element + " ");
        }

    }
}