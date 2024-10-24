package FundamentalsBASIC;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());



        int timeAfter30Minutes = minutes + 30;

        if (timeAfter30Minutes > 59) {

            hour += 1;
            timeAfter30Minutes -= 60;


        }

        if (hour > 23) {

            hour = 0;

        }

        System.out.printf("%d:%02d", hour, timeAfter30Minutes);

    }
}
