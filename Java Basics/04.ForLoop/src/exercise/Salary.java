package ForLoopExercise;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersOfOpenTabsInBrowser = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbersOfOpenTabsInBrowser ; i++) {

            String name = scanner.nextLine();

            switch (name) {

                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%d", salary);

        } else {
            System.out.println("You have lost your salary.");



        }
    }
}
