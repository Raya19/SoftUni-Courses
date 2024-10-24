package FundamentalsBASICexercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        int count = 0;

        for (int i = username.length() - 1; i >= 0; i--) {

            char symbol = username.charAt(i);
            password += symbol;
        }

        String tryPassword = scanner.nextLine();

        while (!password.equals(tryPassword)) {
            count++;

            if (count == 4) {

                System.out.printf("User %s blocked!", username);
                break;
            }


            System.out.println("Incorrect password. Try again.");
            tryPassword = scanner.nextLine();
        }


        if (tryPassword.equals(password)) {


            System.out.printf("User %s logged in.", username);

        }
    }
}
