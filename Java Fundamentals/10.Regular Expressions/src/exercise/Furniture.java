package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furnitures = new ArrayList<>();
        double totalMoney = 0;

        while (!command.equals("Purchase")) {

            Matcher matcher = pattern.matcher(command);

            if (matcher.find()) {

                String furniture = matcher.group("furnitureName");
                furnitures.add(furniture);

                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalMoney += price * quantity;


            }

            command = scanner.nextLine();

        }

            System.out.println("Bought furniture:");
            furnitures.forEach(System.out::println);
            System.out.printf("Total money spend: %.2f", totalMoney);



        }
    }

