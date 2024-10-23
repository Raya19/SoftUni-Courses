package MapsExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {

            if (command.contains("|")) {

                String[] commandParts = command.split(" \\| ");

                String forceSide = commandParts[0];
                String forceUser = commandParts[1];

                if (!forceBook.containsKey(forceSide)) {

                    forceBook.put(forceSide, new ArrayList<>());
                }

                boolean isExist = false;

                for (List<String> list : forceBook.values()) {
                    if (list.contains(forceUser)) {
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {

                    forceBook.get(forceSide).add(forceUser);
                }
            } else if (command.contains(" -> ")) {

                String[] commandParts = command.split(" -> ");

                String forceUser = commandParts[0];
                String forceSide = commandParts[1];


                forceBook.entrySet().forEach(user -> user.getValue().remove(forceUser));

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                    forceBook.get(forceSide).add(forceUser);

                } else {

                    forceBook.get(forceSide).add(forceUser);


                }

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

            }

            command = scanner.nextLine();

        }


        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {

            if (entry.getValue().size() != 0) {


                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(user -> System.out.println("! " + user));

            }


        }
    }
}