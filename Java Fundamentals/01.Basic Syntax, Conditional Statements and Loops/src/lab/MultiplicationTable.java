package FundamentalsBASIC;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = 1; i <= 10; i++) {

            result = n * i;


            System.out.printf("%d X %d = %d%n", n, i, result);

        }

    }
}