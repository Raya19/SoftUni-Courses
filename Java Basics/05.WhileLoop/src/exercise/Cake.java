package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int countPieces = width * lenght;

        String command = scanner.nextLine();
        boolean noMoreCake = false;

        while (!command.equals("STOP")) {

            int pieces = Integer.parseInt(command);
            countPieces = countPieces - pieces;

            if (countPieces <= 0) {
                noMoreCake = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
        } else {
            System.out.printf("%d pieces are left.", countPieces);
        }
    }
}
