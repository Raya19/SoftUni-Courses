package FundamentalsBASICexercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double lightsabersBreak = Math.ceil(countOfStudents + 0.1 * countOfStudents);
        int freeBelts = countOfStudents / 6;

     double totalMoney = priceOfLightsabers * lightsabersBreak + priceOfRobes * countOfStudents + priceOfBelts * (countOfStudents - freeBelts);

    if (totalMoney <= amountOfMoney) {

        System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
    }

    else {

        System.out.printf("George Lucas will need %.2flv more.", totalMoney - amountOfMoney);
    }
    }


}
