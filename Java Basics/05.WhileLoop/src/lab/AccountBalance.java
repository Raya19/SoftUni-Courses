package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double importMoney = 0;
        double totalMoney = 0;


        while (!command.equals("NoMoreMoney")) {

            importMoney = Double.parseDouble(command);

            if (importMoney >= 0) {

                System.out.printf("Increase: %.2f%n", importMoney);
            } else {
                System.out.println("Invalid operation!");
                break;
            }

            totalMoney = totalMoney + importMoney;


            command = scanner.nextLine();


            }

            System.out.printf("Total: %.2f%n", totalMoney);




            }


        }



