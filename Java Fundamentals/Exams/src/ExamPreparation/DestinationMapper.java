package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);


        List<String> validLocations = new ArrayList<>();

        int travelPoints = 0;

        while (matcher.find()) {

            validLocations.add(matcher.group("destination"));

        }

        for (String validLocation : validLocations) {

            travelPoints += validLocation.length();

        }

        System.out.println("Destinations: " + String.join(", ", validLocations));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
