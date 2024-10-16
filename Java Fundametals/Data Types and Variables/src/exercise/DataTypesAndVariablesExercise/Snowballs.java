package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (snowballValue > maxSnowballValue) {

                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }

            if (i == numberOfSnowballs - 1) {

                System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
            }
        }


    }
}
