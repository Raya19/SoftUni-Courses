package Advanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (typeProjection.equals("Premiere")) {
            income = rows * columns * 12;

        }

        else if (typeProjection.equals("Normal")) {
            income = rows * columns * 7.50;

        }
        else if (typeProjection.equals("Discount")) {
            income = rows * columns * 5.00;
        }

        System.out.printf("%.2f leva", income);


    }
}
