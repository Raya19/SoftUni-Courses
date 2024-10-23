package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

        int numbmer = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < array.length; i++) {

            int firstElement = array[i];


            for (int j = i + 1; j < array.length; j++) {

                int element = array[j];

                if (firstElement + element == numbmer) {

                    System.out.print(firstElement + " ");
                    System.out.print(element);
                    System.out.println();
                }

            }
        }
    }
}
