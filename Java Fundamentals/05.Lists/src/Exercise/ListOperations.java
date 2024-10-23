package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandParts = command.split(" ");

            if (command.contains("Add")) {

                int numberToAdd = Integer.parseInt(commandParts[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {

                int numberToInsert = Integer.parseInt(commandParts[1]);
                int index1 = Integer.parseInt(commandParts[2]);

                if (index1 < 0 || index1 > numbers.size()) {

                    System.out.println("Invalid index");
                } else {

                    numbers.add(index1, numberToInsert);
                }

            } else if (command.contains("Remove")) {

                int indexToRemove = Integer.parseInt(commandParts[1]);

                if (indexToRemove > numbers.size() || indexToRemove < 0) {

                    System.out.println("Invalid index");

                } else {

                    numbers.remove(indexToRemove);
                }

            } else if (command.contains("Shift left")) {

                int count1 = Integer.parseInt(commandParts[2]);

                for (int i = 0; i < count1; i++) {

                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);


                }

            } else if (command.contains("Shift right")) {

                int count2 = Integer.parseInt(commandParts[2]);

                for (int i = 0; i < count2; i++) {

                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);


                }


            }


            command = scanner.nextLine();
        }

        System.out.println(numbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
