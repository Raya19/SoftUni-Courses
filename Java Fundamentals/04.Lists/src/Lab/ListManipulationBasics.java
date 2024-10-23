package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            String commandName = commandParts[0];

            switch (commandName) {

                case "Add":

                    int number = Integer.parseInt(commandParts[1]);
                    numbers.add(number);
                    break;

                case "Remove":

                    int number2 = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(number2));
                    break;

                case "RemoveAt":

                    int index = Integer.parseInt(commandParts[1]);
                    numbers.remove(index);
                    break;

                case "Insert":

                    int number3 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);

                    numbers.add(index2, number3);
                    break;
            }


            command = scanner.nextLine();
        }

        for (int element : numbers) {

            System.out.print(element + " ");

        }
    }
}
