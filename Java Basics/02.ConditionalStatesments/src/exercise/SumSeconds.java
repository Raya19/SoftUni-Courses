package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timeInSec1 = Integer.parseInt(scanner.nextLine());
        int timeInSec2 = Integer.parseInt(scanner.nextLine());
        int timeInSec3 = Integer.parseInt(scanner.nextLine());

        int totalTime = timeInSec1 + timeInSec2 + timeInSec3;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }

        else {
            System.out.printf("%d:%d", minutes, seconds);
        }






    }
}
