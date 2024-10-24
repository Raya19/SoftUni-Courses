package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        int countCars = 0;
        int countTrucks = 0;
        int sumHorsepowerOfTheCars = 0;
        int sumHorsepowerOfTheTrucks = 0;



        List<VehicleCatalogue> listOfVehicles = new ArrayList<>();



        while (!data.equals("End")) {

            String[] commandParts = data.split(" ");
            String typeVehicle = commandParts[0];
            String model = commandParts[1];
            String color = commandParts[2];
            int horsePower = Integer.parseInt(commandParts[3]);


            VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(typeVehicle, model, color, horsePower);

            listOfVehicles.add(vehicleCatalogue);

            data = scanner.nextLine();

        }

        String commandModel = scanner.nextLine();



        while (!commandModel.equals("Close the Catalogue")) {

            for (VehicleCatalogue vehicle : listOfVehicles) {

                if (vehicle.getModel().equals(commandModel)) {


                    System.out.println(vehicle.toString());

                }
            }

            commandModel = scanner.nextLine();

        }

        for (VehicleCatalogue vehicle : listOfVehicles) {

            if (vehicle.getTypeVehicle().equals("car")) {
                countCars++;
                sumHorsepowerOfTheCars += vehicle.getHorsePower();
            }
            else if (vehicle.getTypeVehicle().equals("truck")){
                countTrucks++;
                sumHorsepowerOfTheTrucks += vehicle.getHorsePower();
            }

        }


        if (countCars == 0) {


            System.out.printf("Cars have average horsepower of: %.2f.%n", sumHorsepowerOfTheCars * 1.0);

        }
        else {

            System.out.printf("Cars have average horsepower of: %.2f.%n", sumHorsepowerOfTheCars * 1.0 / countCars);

        }



        if (countTrucks == 0) {


            System.out.printf("Trucks have average horsepower of: %.2f.%n", sumHorsepowerOfTheTrucks * 1.0);

        }
        else {

            System.out.printf("Trucks have average horsepower of: %.2f.%n", sumHorsepowerOfTheTrucks * 1.0 / countTrucks);

        }

    }

}
