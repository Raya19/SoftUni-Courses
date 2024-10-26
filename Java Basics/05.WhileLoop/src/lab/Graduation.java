package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();

        int classes = 1;
        boolean isExcluded = false;
        int countPoorGrades = 0;

        double sumGrades = 0;

        while (classes <= 12) {
            if (countPoorGrades > 1) {
                isExcluded = true;
                break;


            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                classes++;


            } else {
                countPoorGrades++;
            }

            sumGrades = sumGrades + grade;
        }

        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, classes);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }


    }
}