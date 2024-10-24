package ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double lunch = durationOfBreak / 8.0;
        double rest = durationOfBreak / 4.0;

        double remainingTime = durationOfBreak - lunch - rest;

        if (remainingTime >= durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(remainingTime - durationOfEpisode));

        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(durationOfEpisode - remainingTime));
        }





    }
}
