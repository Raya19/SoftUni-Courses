package Advanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String vacation = "";
        String destination = "";


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                vacation = "Camp";
                budget = 0.30 * budget;
            } else if (season.equals("winter")) {
                vacation = "Hotel";
                budget = 0.70 * budget;

            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                vacation = "Camp";
                budget = 0.40 * budget;
            } else if (season.equals("winter")) {
                vacation = "Hotel";
                budget = 0.80 * budget;

            }
        } else if (budget > 1000) {
            destination = "Europe";
            vacation = "Hotel";
            budget = 0.90 * budget;

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacation, budget);
    }


}


