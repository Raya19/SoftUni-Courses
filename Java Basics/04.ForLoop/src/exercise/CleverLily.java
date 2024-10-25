package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceForOneToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;
        double money = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                money = money + 10;
                sum = sum + money;
                brother++;

            } else {
                countToys++;
            }
        }

        double toySum = priceForOneToy * countToys;
        double totalMoney = sum - brother + toySum;

        if (totalMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - priceWashingMachine);
        }
        else {
            System.out.printf("No! %.2f", priceWashingMachine - totalMoney);
        }




            
        }



        }




