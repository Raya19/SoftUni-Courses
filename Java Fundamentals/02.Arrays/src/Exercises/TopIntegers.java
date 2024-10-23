package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int lastElement = array[array.length - 1];


        for (int i = 0; i < array.length - 1; i++) {

            boolean isBigger = true;

            int currentNumber = array[i];

            for (int j = i + 1; j <= array.length - 1; j++) {

                int numberAfter = array[j];

                if (currentNumber <= numberAfter) {

                    isBigger = false;

                    break;
                }


            }

            if (isBigger) {

                System.out.print(currentNumber + " ");
            }
        }

        System.out.println(lastElement);
    }
}
