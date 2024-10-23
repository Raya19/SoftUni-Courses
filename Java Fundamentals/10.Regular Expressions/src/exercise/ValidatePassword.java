package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {

            String password = scanner.nextLine();

            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {

                StringBuilder sb = new StringBuilder();

                for (char symbol : password.toCharArray()) {

                    if (Character.isDigit(symbol)) {

                        sb.append(symbol);

                    }

                }

                if (sb.length() == 0) {

                    System.out.println("Group: default");
                }

                else {

                    System.out.printf("Group: %s%n", sb.toString());
                }

            } else {

                System.out.println("Invalid pass!");
            }


        }
    }
}
