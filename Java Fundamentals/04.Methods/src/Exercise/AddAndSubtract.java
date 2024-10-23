package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getSum(firstNum, secondNum) - thirdNum);

    }

    public static int getSum (int firstNum, int secondNum) {

        return firstNum + secondNum;
    }


}
