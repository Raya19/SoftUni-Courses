package NestedLoopsLab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                String type = "";

                if (i == floor) {
                    type = "L";
                } else if (i % 2 == 0) {
                    type = "O";
                } else {
                    type = "A";
                }

                System.out.printf("%s%d%d ", type, i, j);


            }
            System.out.println();

        }

    }
}




                


