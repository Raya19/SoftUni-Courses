package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double area = 0;

        if (type.equals("square")) {

            double size = Double.parseDouble(scanner.nextLine());
            area = size * size;
            System.out.printf("%.3f", area);
        }

        else if (type.equals("rectangle")) {
            double size = Double.parseDouble(scanner.nextLine());
            double size1 = Double.parseDouble(scanner.nextLine());
            area = size * size1;
            System.out.printf("%.3f", area);
        }

        else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);
        }

        else if (type.equals("triangle")) {
            double size = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (size * height) /2;
            System.out.printf("%.3f", area);

        }


    }
}
