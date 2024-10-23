package MapsLab;

import javax.swing.*;
import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        Map<String, Integer> oddOccurrences = new LinkedHashMap<>();


        for (String word : array) {

            word = word.toLowerCase();


            if (oddOccurrences.containsKey(word)) {

                oddOccurrences.put(word, oddOccurrences.get(word) + 1);


            } else {

                oddOccurrences.put(word, 1);

            }


        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : oddOccurrences.entrySet()) {


            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());


            }
        }

        for (int i = 0; i < resultList.size(); i++) {

            if (i == resultList.size() - 1) {

                System.out.println(resultList.get(i));

            } else {

                System.out.print(resultList.get(i) + ", ");

            }


        }

    }
}

