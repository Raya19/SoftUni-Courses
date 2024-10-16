package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (people > capacity) {

            double numberOfFullCourses = people * 1.0 / capacity;
            double numberRoundedUp = Math.ceil(numberOfFullCourses);


            System.out.printf("%.0f" , numberRoundedUp);


        } else {

            System.out.println(1);
        }
    }
}
