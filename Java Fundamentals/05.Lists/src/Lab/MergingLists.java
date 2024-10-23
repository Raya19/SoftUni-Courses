package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Integer> resultList = new ArrayList<>();

        int minSizeOfTheList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i <= minSizeOfTheList - 1; i++) {

            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));

        }


        if (firstList.size() > secondList.size()) {

            List<Integer> subList = firstList.subList(minSizeOfTheList, firstList.size());

            resultList.addAll(subList);
        } else {

            List<Integer> subList = secondList.subList(minSizeOfTheList, secondList.size());

            resultList.addAll(subList);
        }

        for (int element : resultList) {

            System.out.print(element + " ");

        }
    }

}

