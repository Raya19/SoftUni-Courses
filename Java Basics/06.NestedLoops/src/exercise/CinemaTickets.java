package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int countStandard = 0;
        int countStudent = 0;
        int countKid = 0;

        int countTotalTickets = 0;

        while (!command.equals("Finish")) {
            String name = command;
            int seats = Integer.parseInt(scanner.nextLine());


            int countCurrentTickets = 0;
            String typeTicket = scanner.nextLine();

            while (!typeTicket.equals("End")) {

                countCurrentTickets++;
                countTotalTickets++;

                if (typeTicket.equals("student")) {
                    countStudent++;
                } else if (typeTicket.equals("standard")) {
                    countStandard++;
                } else if (typeTicket.equals("kid")) {
                    countKid++;
                }

                if (countCurrentTickets >= seats) {
                    break;
                }

                typeTicket = scanner.nextLine();

            }

            System.out.printf("%s - %.2f%% full.%n", name, countCurrentTickets * 1.0 / seats * 100);

            command = scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudent * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", countKid * 1.0 / countTotalTickets * 100);


    }


}
