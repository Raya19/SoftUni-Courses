package MapsLab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = Arrays.stream(scanner.nextLine().split(" "))
                     .mapToDouble(Double::parseDouble)
                     .toArray();


        Map<Double, Integer> countRealNumbers = new TreeMap<>();

        for (double number : array) {

            if (countRealNumbers.containsKey(number)) {

                countRealNumbers.put(number, countRealNumbers.get(number) + 1);

            } else {

                countRealNumbers.put(number, 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : countRealNumbers.entrySet()) {

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
