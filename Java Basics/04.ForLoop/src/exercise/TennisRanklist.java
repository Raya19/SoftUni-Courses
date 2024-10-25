package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int pointsFromTour = 0;
        int tournamentsWin = 0;

        for (int i = 1; i <= tournaments; i++) {

            String stage = scanner.nextLine();

            switch (stage) {

                case "W":
                    initialPoints = initialPoints + 2000;
                    tournamentsWin++;
                    pointsFromTour = pointsFromTour + 2000;
                    break;
                case "F":
                    initialPoints = initialPoints + 1200;
                    pointsFromTour = pointsFromTour + 1200;
                    break;
                case "SF":
                    initialPoints = initialPoints + 720;
                    pointsFromTour = pointsFromTour + 720;
                    break;
            }


            }

        System.out.printf("Final points: %d%n", initialPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(pointsFromTour * 1.0 / tournaments));
        System.out.printf("%.2f%%", tournamentsWin  * 1.0 / tournaments * 100);

        }


        }

