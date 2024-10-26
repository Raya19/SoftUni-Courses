package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int allProblems = 0;
        int counterProblems = 0;
        String lastProblem = "";
        int countPoorGrades = 0;

        boolean needBreak = false;

        while (!command.equals("Enough")) {
            String currentProblem = command;
            int grade = Integer.parseInt(scanner.nextLine());

            allProblems = allProblems + grade;
            counterProblems++;

            if (grade <= 4) {
                countPoorGrades++;
            }


            if (countPoorGrades >= maxPoorGrades) {
                needBreak = true;
                break;

            }


            lastProblem = command;


            command = scanner.nextLine();


        }


        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", allProblems * 1.0 / counterProblems);
            System.out.printf("Number of problems: %d%n", counterProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }


    }
}


