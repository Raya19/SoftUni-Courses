package ListExercise;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();


        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            if (command.contains("Add")) {

                int passengers = Integer.parseInt(commandParts[1]);
                wagons.add(passengers);


            }
            else {

                for (int i = 0; i <= wagons.size() - 1; i++) {

                    int passengers = Integer.parseInt(commandParts[0]);

                    if (passengers + wagons.get(i) <= maxCapacityOfEachWagon) {

                        wagons.set(i, passengers + wagons.get(i));
                        break;
                    }

                }
            }


            command = scanner.nextLine();
        }


        for (int element : wagons) {

            System.out.print(element + " ");

        }
    }


}
