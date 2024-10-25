package Advanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysForStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String value = scanner.nextLine();

        double priceRoomForOnePerson = 0;
        double priceApartment = 0;
        double presidentApartment = 0;

        double priceForHoliday = 0;


        switch (typeOfRoom) {
            case "room for one person":

                priceForHoliday = 18 * (daysForStay - 1);
                break;

                case "apartment":
                priceForHoliday = 25 * (daysForStay - 1);


                if (daysForStay < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.3);
                } else if (daysForStay >= 10 && daysForStay <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.35);
                } else if (daysForStay > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.5);
                }
                    break;
            case "president apartment":
                priceForHoliday = 35 * (daysForStay - 1);

                if (daysForStay < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.1);
                } else if (daysForStay >= 10 && daysForStay <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.15);
                } else if (daysForStay > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.2);
                }

                break;


        }

        if (value.equals("positive")) {
            priceForHoliday = priceForHoliday + 0.25 * priceForHoliday;

        } else if (value.equals("negative")) {
            priceForHoliday = priceForHoliday - 0.1 * priceForHoliday;

        }

        System.out.printf("%.2f", priceForHoliday);


    }
}
