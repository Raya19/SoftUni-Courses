package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (product) {

            case "coffee":

                System.out.printf("%.2f",calculatesTheTotalPriceOfAnCoffee(quantity, price));
                break;

            case "water":

                System.out.printf("%.2f",calculatesTheTotalPriceOfAnWater(quantity, price));
                break;

            case "coke":

                System.out.printf("%.2f",calculatesTheTotalPriceOfAnCoke(quantity, price));
                break;

            case "snacks":

                System.out.printf("%.2f",calculatesTheTotalPriceOfAnSnacks(quantity, price));
                break;
        }
    }

    public static double calculatesTheTotalPriceOfAnCoffee (int quantity, double price) {

        price = 1.50;
        return quantity * price;
    }

    public static double calculatesTheTotalPriceOfAnWater (int quantity, double price) {

        price = 1;
        return quantity * price;
    }

    public static double calculatesTheTotalPriceOfAnCoke (int quantity, double price) {

        price = 1.40;
        return quantity * price;
    }

    public static double calculatesTheTotalPriceOfAnSnacks(int quantity, double price) {

        price = 2;
        return quantity * price;
    }

}

