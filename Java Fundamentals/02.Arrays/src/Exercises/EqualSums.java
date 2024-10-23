package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isValid = false;

        for (int i = 0; i <= array.length - 1; i++) {

            int rightSum = 0;
            int leftSum = 0;

            int currentNumber = array[i];

            for (int leftIndex = 0; leftIndex < i; leftIndex++) {

                leftSum += array[leftIndex];


            }

            for (int rightIndex = i + 1; rightIndex <= array.length - 1; rightIndex++) {

                rightSum += array[rightIndex];
            }


            if (leftSum == rightSum) {
                isValid = true;
                System.out.println(i);
                break;

            }
        }

        if (!isValid) {

            System.out.println("no");
        }


    }

}