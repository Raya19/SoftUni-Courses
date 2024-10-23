package MapsExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        Map<String, Double> orders = new LinkedHashMap<>();

        Map<String, Integer> pairs = new LinkedHashMap<>();


        while (!command.equals("buy")) {

            String[] commandParts = command.split(" ");

            String nameProduct = commandParts[0];
            double price = Double.parseDouble(commandParts[1]);
            int quantity = Integer.parseInt(commandParts[2]);


            if (!orders.containsKey(nameProduct)) {

                orders.put(nameProduct, price * quantity);
                pairs.put(nameProduct, quantity);

            } else {

                    for (Map.Entry<String, Integer> entry2 : pairs.entrySet()) {

                        if (entry2.getKey().equals(nameProduct)) {

                            int value = pairs.get(entry2.getKey());
                            pairs.put(entry2.getKey(), value + quantity);
                            orders.put(nameProduct, (value + quantity) * price);
                            //break;

                        }

                    }

                }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : orders.entrySet()) {

            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}