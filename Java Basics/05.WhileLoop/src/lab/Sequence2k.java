package WhileLoopLab;

import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;

        while (currentNum <= n) {


            currentNum = currentNum * 2 + 1;

            if (currentNum > n) {
                break;
            }


            System.out.println(currentNum);


        }
    }
}