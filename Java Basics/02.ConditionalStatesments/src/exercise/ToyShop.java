package ConditionalStatements;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double pricePuzzle = puzzles * 2.60;
        double priceDoll = dolls * 3;
        double priceBear = bears * 4.10;
        double priceMinion = minions * 8.20;
        double priceTruck = trucks * 2;

        int toys = puzzles + dolls + bears + minions + trucks;
        double totalPrice = pricePuzzle + priceDoll + priceBear + priceMinion + priceTruck;

        if (toys >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        totalPrice = totalPrice - (totalPrice * 0.1);

        double diff = Math.abs(totalPrice - priceExcursion);

        if (totalPrice >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }





    }
}
