package ConditionalStatements;


import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesForOneStatist = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;

        double clothes = statists * clothesForOneStatist;


        if (statists > 150) {
            clothes = clothes - (clothes * 0.1);
        }

        double totalPrice = decor + clothes;


        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        }

        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }



    }
}
