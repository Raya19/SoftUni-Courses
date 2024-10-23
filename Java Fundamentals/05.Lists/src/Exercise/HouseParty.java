package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {

            String command = scanner.nextLine();

            String[] commandParts = command.split(" ");
            String name = commandParts[0];

            if (!command.contains("not")) {

                if (!guestsList.contains(name)) {

                 guestsList.add(name);


                 } else {

                    System.out.printf("%s is already in the list!%n", name);
                }



            } else {

                if (guestsList.contains(name)) {

                    guestsList.remove(name);
                }

                else {

                    System.out.printf("%s is not in the list!%n", name);


                }


            }

        }

        for (int i = 0; i < guestsList.size(); i++) {


        System.out.println(guestsList.get(i));
    }
}

    }