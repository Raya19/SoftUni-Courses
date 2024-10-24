package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Generate")) {

            String[] commandParts = command.split(">>>");
            String commandType = commandParts[0];

            switch (commandType) {

                case "Contains":

                    String substring = commandParts[1];

                    if (activationKey.contains(substring)) {

                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {

                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":

                    String upperOrLower = commandParts[1];
                    int startIndex = Integer.parseInt(commandParts[2]);
                    int endIndex = Integer.parseInt(commandParts[3]);

                    if (upperOrLower.equals("Upper")) {

                        String substring2 = activationKey.substring(startIndex, endIndex);
                        activationKey = activationKey.replace(substring2, substring2.toUpperCase());

                    } else {

                        String substring2 = activationKey.substring(startIndex, endIndex);
                        activationKey = activationKey.replace(substring2, substring2.toLowerCase());

                    }

                    System.out.println(activationKey);
                    break;
                case "Slice":

                    int startIndx = Integer.parseInt(commandParts[1]);
                    int endIndx = Integer.parseInt(commandParts[2]);

                    String substring3 = activationKey.substring(startIndx, endIndx);
                    activationKey = activationKey.replace(substring3, "");

                    System.out.println(activationKey);
                    break;
            }


            command = scanner.nextLine();

        }

        System.out.printf("Your activation key is: %s", activationKey);
    }
}
