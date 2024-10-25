package Advanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = hourExam * 60 + minExam;
        int arrivalTimeInMinutes = hourArrival * 60 + minArrival;

        int diff = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);

        if (examTimeInMinutes < arrivalTimeInMinutes) {
            System.out.println("Late");

            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }

        } else if (examTimeInMinutes == arrivalTimeInMinutes || diff <= 30) {
            System.out.println("On time");

            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);

            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }

        }

    }
}