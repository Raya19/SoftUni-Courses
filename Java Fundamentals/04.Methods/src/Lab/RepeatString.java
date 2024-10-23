package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());


        System.out.println(printRepeatString(name, count));
    }

    public static String printRepeatString(String name, int count) {

        String result = "";

        for (int i = 1; i <= count; i++) {

            result += name;
        }

        return result;

    }
}
