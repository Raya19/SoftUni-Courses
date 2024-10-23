package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int count = 0;

        int originalValue = pokePower;

        while (pokePower >= distance) {

            pokePower -= distance;
            count++;

            if (pokePower == 0.5 * originalValue && exhaustionFactor != 0) {

                pokePower /= exhaustionFactor;


            }
        }

        System.out.println(pokePower);
        System.out.println(count);
    }
}
