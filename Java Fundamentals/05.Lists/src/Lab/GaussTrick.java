package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                               .map(Integer::parseInt)
                               .collect(Collectors.toList());


        int sizeOfTheList = numbers.size();

        for (int i = 0; i < sizeOfTheList / 2; i++) {

            int firstElement = numbers.get(i);
            int lastElement = numbers.get(numbers.size() - 1);


            numbers.set(i, firstElement + lastElement);
            numbers.remove(Integer.valueOf(lastElement));

        }

        for (int element : numbers) {

            System.out.print(element + " ");

        }
    }
}
