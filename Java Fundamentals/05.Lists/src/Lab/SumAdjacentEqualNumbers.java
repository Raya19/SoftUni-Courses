package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());




        for (int i = 0; i < numbers.size() - 1; i++) {

            double firstNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);

            if (firstNum == nextNum) {

                numbers.set(i, firstNum + nextNum);
                numbers.remove(i + 1);
                i = -1;
            }

        }


        for (double number : numbers) {

            DecimalFormat df = new DecimalFormat("0.####");

            System.out.print(df.format(number) + " ");

        }

    }
}
