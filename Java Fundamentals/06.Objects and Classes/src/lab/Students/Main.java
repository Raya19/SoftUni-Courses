package Students;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        List<Students> listStudents = new ArrayList<>();

        while (!data.equals("end")) {

            String firstName = data.split(" ")[0];
            String lastName = data.split(" ")[1];
            int age = Integer.parseInt(data.split(" ")[2]);
            String town = data.split(" ")[3];

            Students student = new Students(firstName, lastName, age, town);

            listStudents.add(student);

            data = scanner.nextLine();

        }

        String city = scanner.nextLine();

        for (Students student : listStudents) {


            if (city.equals(student.getTown())) {

                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}