package Advanced;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        double priceTicket = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                priceTicket = 12;
                break;
            case "Wednesday":
            case "Thursday":
                priceTicket = 14;
                break;
            case "Saturday":
            case "Sunday":
                priceTicket = 16;
                break;

        }

            System.out.printf("%.0f" , priceTicket);

        }


    }

