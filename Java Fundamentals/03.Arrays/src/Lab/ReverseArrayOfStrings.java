package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        //for (int i = array.length - 1; i >= 0; i--) {

        //   System.out.print(array[i] + " ");

        // }

        for (int i = 0; i < array.length / 2; i++) {

            String oldElement = array[i];
            array[i] = array[array.length - 1 - i];

            array[array.length - 1 - i] = oldElement;

        }

        System.out.println(String.join(" ", array));


    }
}
