package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listWords = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

       while (!listWords.isEmpty()) {

            int randomIndex = rnd.nextInt(listWords.size());

            System.out.println(listWords.get(randomIndex));
            listWords.remove(randomIndex);
        }
    }
}
