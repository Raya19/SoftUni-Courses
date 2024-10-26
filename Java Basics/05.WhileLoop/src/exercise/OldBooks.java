package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();

        String command = scanner.nextLine();
        boolean noMoreBook = false;

        int counter = 0;

        while (!command.equals(favouriteBook)) {

                command = scanner.nextLine();
                counter++;

            if (command.equals("No More Books")) {
                noMoreBook = true;
                break;


            }
        }

        if (noMoreBook) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        } else {
            System.out.printf("You checked %d books and found it.", counter);
        }


            }
        }








