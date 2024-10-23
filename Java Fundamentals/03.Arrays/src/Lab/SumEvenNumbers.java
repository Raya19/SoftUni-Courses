package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();


        int evenSum = 0;

        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] % 2 == 0) {

                evenSum += array[i];
            }

        }

        System.out.println(evenSum);
    }
}
