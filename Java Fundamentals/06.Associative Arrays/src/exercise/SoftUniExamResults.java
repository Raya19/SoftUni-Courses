package MapsExercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<Integer>> results = new LinkedHashMap<>();
        Map<String, List<String>> submissions = new LinkedHashMap<>();

        while (!command.equals("exam finished")) {

            String username = command.split("-")[0];
            String language = command.split("-")[1];
            int points = Integer.parseInt(command.split("-")[2]);

            if (!results.containsKey(username)) {

                results.put(username, new ArrayList<>());
                submissions.put(username, new ArrayList<>());

                results.get(username).add(points);
                submissions.get(username).add(language);

            } else {

                results.get(username).add(points);
                submissions.get(username).add(language);
            }


            command = scanner.nextLine();

        }



        }
    }
