package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        String result = "";

        for (String word : array) {

            int length = word.length();

            for (int i = 0; i < length; i++) {

                result += word;



            }

        }

        System.out.println(result);
    }
}
