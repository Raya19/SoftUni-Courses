package Students2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students2> listOfStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {

          String data = scanner.nextLine();
          String[] commandParts = data.split(" ");
          String firstName = commandParts[0];
            String lastName = commandParts[1];
            double grade = Double.parseDouble(commandParts[2]);

            Students2 students2 = new Students2(firstName, lastName, grade);
            listOfStudents.add(students2);

        }

        Collections.sort(listOfStudents, Comparator.comparingDouble(Students2::getGrade).reversed());

        for (Students2 student : listOfStudents) {

            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());

        }
    }
}
