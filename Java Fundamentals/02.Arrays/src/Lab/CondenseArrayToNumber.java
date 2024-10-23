package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] condensedArray = new int[array.length - 1];

        boolean isLength1 = false;

        if (array.length == 1) {
            isLength1 = true;
            System.out.println(array[0]);

        }

        while (array.length > 1) {

            condensedArray = new int[array.length - 1];

            for (int i = 0; i < array.length - 1; i++) {

                condensedArray[i] = array[i] + array[i + 1];

            }

            array = condensedArray;
        }

        if (!isLength1) {


            System.out.println(condensedArray[0]);
        }

    }
}
