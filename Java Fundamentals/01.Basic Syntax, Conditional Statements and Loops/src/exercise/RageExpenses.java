package FundamentalsBASICexercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countTrashedHeadset = lostGamesCount / 2;
        int countTrashedMouse = lostGamesCount / 3;
        int countTrashedKeyboard = lostGamesCount / 6;
        int countTrashedDisplay = lostGamesCount / 12;


        double priceTrashedHeadset = countTrashedHeadset * headsetPrice;
        double priceTrashedMouse = countTrashedMouse * mousePrice;
        double priceTrashedKeyboard = countTrashedKeyboard * keyboardPrice;
        double priceTrashedDisplay = countTrashedDisplay * displayPrice;


        double sum = priceTrashedHeadset + priceTrashedMouse + priceTrashedKeyboard + priceTrashedDisplay;

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
