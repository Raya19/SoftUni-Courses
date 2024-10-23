package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = array[index1];
                int element2 = array[index2];

                array[index2] = element1;
                array[index1] = element2;

            } else if (command.contains("multiply")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int result = array[index1] * array[index2];
                array[index1] = result;
            }

            else if (command.equals("decrease")) {

                for (int i = 0; i <= array.length - 1; i++) {

                    array[i] -= 1;

                }


            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(array)
                .replace("[", "")
                .replace("]", ""));
    }
}
