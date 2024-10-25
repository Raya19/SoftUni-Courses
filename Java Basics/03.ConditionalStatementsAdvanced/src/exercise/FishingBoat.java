package Advanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double priceShip = 0;

        switch (season) {
            case "Spring":
                priceShip = 3000;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.1);
                } else if (fishermen > 7 && fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else if (fishermen > 12) {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;

            case "Summer":
            case "Autumn":
                priceShip = 4200;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.1);
                } else if (fishermen > 7 && fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else if (fishermen > 12) {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;

            case "Winter":
                priceShip = 2600;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.1);
                } else if (fishermen > 7 && fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else if (fishermen > 12) {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;
        }

        if (fishermen % 2 == 0 && !(season.equals("Autumn"))) {
            priceShip = priceShip - (priceShip * 0.05);
        }


            if (budget >= priceShip) {
                System.out.printf("Yes! You have %.2f leva left.", budget - priceShip);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);


            }
        }


    }


