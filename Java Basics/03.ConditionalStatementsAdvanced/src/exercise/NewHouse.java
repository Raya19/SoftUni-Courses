package Advanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int flower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (flowers.equals("Roses")) {
            totalPrice = 5.00 * flower;
            if (flower > 80) {
                totalPrice = totalPrice - (totalPrice * 0.10);

            }
        }
            else if (flowers.equals("Dahlias")) {
                totalPrice = 3.80 * flower;
            if (flower > 90) {
                totalPrice = totalPrice - (totalPrice * 0.15);

            }
        }
                else if (flowers.equals("Tulips")) {
                    totalPrice = 2.80 * flower;
            if (flower > 80) {
                totalPrice = totalPrice - (totalPrice * 0.15);

            }
        }
                else if (flowers.equals("Narcissus")) {
                    totalPrice = 3.00 * flower;
            if (flower < 120) {
                totalPrice = totalPrice + (totalPrice * 0.15);


            }

        }
                else if (flowers.equals("Gladiolus")) {
                    totalPrice = 2.50 * flower;
            if (flower < 80) {
                totalPrice = totalPrice + (totalPrice * 0.2);

            }
        }
                if (budget >= totalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flower, flowers, budget - totalPrice);
                }
                else {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
                }


    }
}
