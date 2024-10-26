package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;



        while (!command.equals("Stop")) {

            int currentNum = Integer.parseInt(command);

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }


            command = scanner.nextLine();
        }
            System.out.println(maxNum);

        }




    }





