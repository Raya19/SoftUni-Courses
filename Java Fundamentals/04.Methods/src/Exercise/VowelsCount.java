package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().toLowerCase();

        printVowelsCount(name);
    }


    public static void printVowelsCount(String name) {

        int count = 0;

        for (int i = 0; i <= name.length() - 1; i++) {

            char letter = name.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

                count ++;
            }
        }

        System.out.println(count);


    }
}
