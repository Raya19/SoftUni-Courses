package ExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] informationPlants = scanner.nextLine().split("<->");

            String plant = informationPlants[0];
            int rarity = Integer.parseInt(informationPlants[1]);

            plants.put(plant, rarity);

        }

        String command = scanner.nextLine();


        while (!command.equals("Exhibition")) {

            String[] commandParts = command.split("[: -]+");
            String commandType = commandParts[0];


            switch (commandType) {


                case "Rate":
                    String plant = commandParts[1];
                    double rating = Integer.parseInt(commandParts[2]);

                   if (!plants.containsKey(plant)) {

                        System.out.println("error");
                        break;
                   }

                    if (!ratings.containsKey(plant)) {

                        ratings.put(plant, new ArrayList<>());
                        ratings.get(plant).add(rating);

                    } else {

                        ratings.get(plant).add(rating);
                    }

                    break;

                case "Update":

                    String plant2 = commandParts[1];
                    int newRarity = Integer.parseInt(commandParts[2]);

                    if (!plants.containsKey(plant2)) {

                        System.out.println("error");
                       break;
                    }

                    plants.put(plant2, newRarity);
                    break;

                case "Reset":

                    String plant3 = commandParts[1];

                    if (!plants.containsKey(plant3)) {

                        System.out.println("error");
                        break;
                    }

                    for (Map.Entry<String, List<Double>> entry : ratings.entrySet()) {

                        if (plant3.equals(entry.getKey())) {

                            entry.getValue().removeAll(entry.getValue());
                        }

                    }
                    break;
               // default:
                  //  System.out.println("error");

            }


            command = scanner.nextLine();

        }


        for (Map.Entry<String, List<Double>> entry : ratings.entrySet()) {

            int count = 0;
            double rates = 0;

            double averageRating = 0;

            if (entry.getValue().size() > 1) {

                for (double rate : entry.getValue()) {

                    rates += rate;
                    count++;
                }

                averageRating = rates / count;
                ratings.put(entry.getKey(), Collections.singletonList(averageRating));

            }
        }


            System.out.println("Plants for the exhibition:");


        for (Map.Entry<String, Integer> entry : plants.entrySet()) {

            if (plants.values().size() == 1 && ratings.values().isEmpty()) {

                System.out.printf("- %s; Rarity: %d; Rating: 0.00 ", entry.getKey(), entry.getValue());
                break;
            }

            for (Map.Entry<String, List<Double>> entry2 : ratings.entrySet()) {

                if (entry.getKey().equals(entry2.getKey())) {


                    System.out.printf("- %s; Rarity: %d; ", entry.getKey(), entry.getValue());

                    if (entry2.getValue().size() == 0) {

                        System.out.print("Rating: 0.00");
                        System.out.println();

                    } else {

                        for (double rate : entry2.getValue()) {

                            System.out.printf("Rating: %.2f%n", rate);
                            break;

                        }
                    }
                }
            }

        }
    }
}
