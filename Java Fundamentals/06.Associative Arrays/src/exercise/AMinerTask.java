package MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int count = 1;
        String resource = "";
        int quantity = 0;

        int quantityOfRepeteadResource = 0;

        Map<String, Integer> pairs = new LinkedHashMap<>();

        while (!command.equals("stop")) {


            if (count % 2 != 0) {
                resource = command;


            } else {

                quantity = Integer.parseInt(command);


            }

            if (count % 2 == 0) {


                if (pairs.containsKey(resource)) {

                    quantityOfRepeteadResource = pairs.get(resource);
                    pairs.put(resource, quantityOfRepeteadResource + quantity);

                } else {

                    pairs.put(resource, quantity);



                }

            }
            command = scanner.nextLine();

            count++;


        }

        for (Map.Entry<String, Integer> entry : pairs.entrySet()) {

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());

        }

    }
}
