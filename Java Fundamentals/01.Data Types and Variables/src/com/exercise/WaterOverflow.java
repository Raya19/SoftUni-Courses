package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= lines; i++) {


            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());

            sum += quantitiesOfWater;

            if (sum > 255) {

                System.out.println("Insufficient capacity!");
                sum -= quantitiesOfWater;
            }


        }

        System.out.println(sum);
    }
}
