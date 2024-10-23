package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());

        int[] people = new int[countOfWagons];
        int sum = 0;

        for (int i = 0; i < countOfWagons; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];

            if (i == countOfWagons - 1) {

                for (int element : people) {

                    System.out.print(element + " ");


                }

                System.out.println();
            }
        }

        System.out.println(sum);


    }
}
