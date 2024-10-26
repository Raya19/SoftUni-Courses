package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       int width = Integer.parseInt(scanner.nextLine());
       int lenght = Integer.parseInt(scanner.nextLine());
       int height = Integer.parseInt(scanner.nextLine());

       int space = width * lenght * height;

       boolean noMoreFreeSpace = false;
       String command = scanner.nextLine();

       while (!command.equals("Done")) {

           int boxes = Integer.parseInt(command);
           space = space - boxes;

           if (space < 0) {
               noMoreFreeSpace = true;
               break;
           }

           command = scanner.nextLine();


       }

       if (noMoreFreeSpace) {
           System.out.printf("No more free space! You need %d Cubic meters more." , Math.abs(space));
       } else {
           System.out.printf("%d Cubic meters left.", space);
       }









        }



    }

