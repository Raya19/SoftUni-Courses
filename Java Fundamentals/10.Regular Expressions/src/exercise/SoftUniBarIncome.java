package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        while (!command.equals("end of shift")) {

            Matcher matcher = pattern.matcher(command);

            if (matcher.find()) {

                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalIncome += count * price;

                System.out.printf("%s: %s - %.2f%n", customerName, product, count * price);

            }

            command = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
