package Articles;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        String title = data.split(", ")[0];
        String content = data.split(", ")[1];
        String author = data.split(", ")[2];

        int n = Integer.parseInt(scanner.nextLine());

        Articles article = new Articles(title, content, author);


        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();
            String[] commandParts = command.split(": ");
            String nameOfTheCommand = commandParts[0];



            switch (nameOfTheCommand) {

                case "Edit":
                    String newContent = commandParts[1];
                    article.edit(newContent);
                    break;

                case "ChangeAuthor":
                    String newAuthor = commandParts[1];
                    article.changeAuthor(newAuthor);
                    break;

                case "Rename":
                    String newTitle = commandParts[1];
                    article.rename(newTitle);
                    break;
            }

        }


        System.out.println(article.toString());


    }
}
