package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
       double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
       int n = Integer.parseInt(scanner.nextLine());
       double result = 0;



        for (int i = 0; i < n  ; i++) {
            String judge = scanner.nextLine();


            double points = Double.parseDouble(scanner.nextLine());

             result = judge.length() * points / 2;

             pointsFromAcademy = pointsFromAcademy + result;


            if (pointsFromAcademy > 1250.5) {
                break;



            }
        }

        if (pointsFromAcademy > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, pointsFromAcademy);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - pointsFromAcademy);



        }
    }


}

