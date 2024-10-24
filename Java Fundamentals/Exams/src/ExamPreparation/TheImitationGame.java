package ExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(encryptedMessage);

        String command = scanner.nextLine();


        while (!command.equals("Decode")) {

            String commandType = command.split("\\|")[0];

            switch (commandType) {

                case "Move":

                    int numberOfLetters = Integer.parseInt(command.split("\\|")[1]);
                    String substring = sb.substring(0, numberOfLetters);

                    sb.delete(0, numberOfLetters);
                    sb.append(substring);

                    break;

                case "Insert":

                    int index = Integer.parseInt(command.split("\\|")[1]);
                    String value = command.split("\\|")[2];

                    sb.insert(index, value);
                    break;

                case "ChangeAll":

                    String substring2 = command.split("\\|")[1];
                    String replacement = command.split("\\|")[2];

                    String currentMessage = sb.toString();
                    currentMessage = currentMessage.replace(substring2, replacement);

                    sb = new StringBuilder(currentMessage);
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", sb.toString());
    }
}
