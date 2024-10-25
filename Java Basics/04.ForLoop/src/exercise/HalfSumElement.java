package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int maxNum = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {


            int currentNum = Integer.parseInt(scanner.nextLine());

            sum = sum + currentNum;

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }

        }

        sum = sum - maxNum;

            int diff = Math.abs(maxNum - sum);

            if (maxNum == sum) {
                System.out.println("Yes");
                System.out.println("Sum = " + maxNum);
            } else {
                System.out.println("No");
                System.out.println("Diff = " + diff);
            }

        }


    }

