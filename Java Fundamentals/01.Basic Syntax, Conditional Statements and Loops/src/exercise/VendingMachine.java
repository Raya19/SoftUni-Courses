package FundamentalsBASICexercise;

import java.util.Scanner;


public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command1 = scanner.nextLine();

        double sum = 0;

        while (!command1.equals("Start")) {

            double coins = Double.parseDouble(command1);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {

                System.out.printf("Cannot accept %.2f%n", coins);

            } else {

                sum += coins;
            }
            command1 = scanner.nextLine();
        }

        String command2 = scanner.nextLine();



        while (!command2.equals("End")) {

            double price = 0;

            switch (command2) {

                case "Nuts":
                    price = 2;
                    break;

                case "Water":

                    price = 0.7;
                    break;

                case "Crisps":

                    price = 1.5;
                    break;

                case "Soda":
                    price = 0.8;
                    break;

                case "Coke":
                    price = 1;
                    break;


            }

            if (!command2.equals("Nuts") && !command2.equals("Water") && !command2.equals("Crisps") && !command2.equals("Soda") && !command2.equals("Coke")) {

                System.out.println("Invalid product");


            }
            else if (sum >= price) {

                System.out.printf("Purchased %s%n", command2);
                sum -= price;


            } else {

                System.out.print("Sorry, not enough money");
                System.out.println();

            }

            command2 = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
