package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("Delete")) {

                int numberToDelete = Integer.parseInt(commandParts[1]);
                numbers.removeAll(Arrays.asList(numberToDelete));

            } else {

                int element = Integer.parseInt(commandParts[1]);
                int position = Integer.parseInt(commandParts[2]);

                numbers.add(position, element);
            }


            command = scanner.nextLine();
        }

        for (int element : numbers) {

            System.out.print(element + " ");

        }
    }
}
