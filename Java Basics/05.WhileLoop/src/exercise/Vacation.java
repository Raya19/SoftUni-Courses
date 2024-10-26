package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyForExcursion = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int totalDays = 0;
        int spendDays = 0;


        while (availableMoney < moneyForExcursion && spendDays < 5) {

            String action = scanner.nextLine();
            double amountSpendOrSave = Double.parseDouble(scanner.nextLine());
            totalDays++;


            switch (action) {
                case "save":
                    spendDays = 0;
                    availableMoney = availableMoney + amountSpendOrSave;
                    break;

                case "spend":
                    spendDays++;
                    availableMoney = availableMoney - amountSpendOrSave;


                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                    break;

            }
        }

            if (spendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(totalDays);

            }
            if (availableMoney >= moneyForExcursion) {
                System.out.printf("You saved the money for %d days.", totalDays);
            }


        }


    }




