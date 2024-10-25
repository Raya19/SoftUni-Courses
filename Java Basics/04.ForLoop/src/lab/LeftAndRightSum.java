package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());


       int leftSum = 0;

        for (int i = 1; i <= n ; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + currentNum;

        }

        int rightSum = 0;

        for (int i = 1; i <= n ; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currentNum;

        }

        if (leftSum == rightSum) {

            System.out.println("Yes, sum = " + leftSum);
        }

        else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }


    }
}

