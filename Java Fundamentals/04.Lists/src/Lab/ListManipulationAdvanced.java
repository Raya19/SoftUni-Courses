package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("Contains")) {

                int number = Integer.parseInt(commandParts[1]);

                if (numbers.contains(number)) {

                    System.out.println("Yes");

                } else {

                    System.out.println("No such number");
                }

            } else if (command.equals("Print even")) {

                for (int i = 0; i <= numbers.size() - 1; i++) {


                    if (numbers.get(i) % 2 == 0) {

                        int evenNumber = numbers.get(i);

                        System.out.print(evenNumber + " ");
                    }

                }

                System.out.println();


            } else if (command.equals("Print odd")) {

                for (int i = 0; i <= numbers.size() - 1; i++) {


                    if (numbers.get(i) % 2 != 0) {

                        int oddNumber = numbers.get(i);

                        System.out.print(oddNumber + " ");
                    }

                }

                System.out.println();

            } else if (command.equals("Get sum")) {

                int sum = 0;
                for (int i = 0; i <= numbers.size() - 1; i++) {


                    sum += numbers.get(i);
                }

                System.out.println(sum);
            } else if (commandParts[0].equals("Filter")) {

                String condition = commandParts[1];
                int number = Integer.parseInt(commandParts[2]);


                if (condition.equals(">=")) {

                    for (int i = 0; i <= numbers.size() - 1; i++) {

                        int currentNum = numbers.get(i);

                        if (currentNum >= number) {


                            System.out.print(currentNum + " ");
                        }


                    }
                    System.out.println();
                } else if (condition.equals("<=")) {

                    for (int i = 0; i <= numbers.size() - 1; i++) {

                        int currentNum = numbers.get(i);
                        if (currentNum <= number) {

                            System.out.print(currentNum + " ");

                        }
                    }
                    System.out.println();
                } else if (condition.equals("<")) {

                    for (int i = 0; i <= numbers.size() - 1; i++) {

                        int currentNum = numbers.get(i);

                        if (currentNum < number) {

                            System.out.print(currentNum + " ");
                        }


                    }
                    System.out.println();
                } else if (condition.equals(">")) {

                    for (int i = 0; i <= numbers.size() - 1; i++) {

                        int currentNum = numbers.get(i);

                        if (currentNum > number) {

                            System.out.print(currentNum + " ");
                        }

                    }
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }
    }

}

