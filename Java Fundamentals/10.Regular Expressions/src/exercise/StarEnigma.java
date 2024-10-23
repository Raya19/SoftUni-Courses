package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        int countAttackedPlanets = 0;
        int countDestroyedPlanets = 0;

        for (int i = 0; i < n; i++) {

            String encryptedText = scanner.nextLine();

            String decryptedText = decryptedText(encryptedText);

            Matcher matcher = pattern.matcher(decryptedText);


            if (matcher.find()) {

                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldiers = Integer.parseInt(matcher.group("soldiers"));


                    if (attackType.equals("A")) {

                        countAttackedPlanets++;
                        attackedPlanets.add(planetName);

                    } else {

                        countDestroyedPlanets++;
                        destroyedPlanets.add(planetName);
                    }


            }


        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d%n", countAttackedPlanets);


        if (countAttackedPlanets > 0) {

            for (int i = 0; i < attackedPlanets.size(); i++) {


                System.out.print("-> ");
                System.out.println(attackedPlanets.get(i));
            }

        }

        System.out.printf("Destroyed planets: %d%n", countDestroyedPlanets);


        if (countDestroyedPlanets > 0) {

            for (int i = 0; i < destroyedPlanets.size(); i++) {

                System.out.print("-> ");
                System.out.println(destroyedPlanets.get(i));
            }
        }
    }

    private static String decryptedText(String encryptedText) {

        int count = 0;
        StringBuilder decryptedText = new StringBuilder();

        for (char symbol : encryptedText.toCharArray()) {

            switch (symbol) {

                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':

                    count++;
                    break;

            }

        }

        for (char symbol : encryptedText.toCharArray()) {


            char decryptedSymbol = (char) (symbol - count);
            decryptedText.append(decryptedSymbol);

        }

        return decryptedText.toString();
    }
}



