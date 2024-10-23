package MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");


            if (commandParts[0].equals("register")) {

                String username = commandParts[1];
                String licensePlateNumber = commandParts[2];

                if (!parking.containsKey(username)) {

                    parking.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);

                } else {

                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);


                }

            } else if (commandParts[0].equals("unregister")) {

                String username = commandParts[1];

                if (!parking.containsKey(username)) {

                    System.out.printf("ERROR: user %s not found%n", username);
                } else {

                    System.out.printf("%s unregistered successfully%n", username);
                    parking.remove(username);
                }


            }

        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {


            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}