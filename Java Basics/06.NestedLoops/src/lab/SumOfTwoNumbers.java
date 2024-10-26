package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        boolean flag = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;

                sum = i + j;

                if (sum == magicNumber) {
                    flag = true;



                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);


                
            }

            
        }
            if (flag) {
                break;
            }
            }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
        }
    }


















