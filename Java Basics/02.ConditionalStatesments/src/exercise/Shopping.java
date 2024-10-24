package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProcessors = processors * 0.35 * priceVideoCards;
        double priceRam = ram * priceVideoCards * 0.1;

        double totalSum = priceVideoCards + priceProcessors + priceRam;

        if (videoCards > processors) {
            totalSum = totalSum - (totalSum * 0.15);
        }

        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        }

        else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}