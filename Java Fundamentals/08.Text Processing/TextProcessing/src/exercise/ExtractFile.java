package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pathFile = scanner.nextLine().split("\\\\");

        String fileNameAndItsExtension = pathFile[pathFile.length - 1];


        String fileName = fileNameAndItsExtension.split("\\.")[0];
        String fileExtension = fileNameAndItsExtension.split("\\.")[1];


        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);


    }
}
