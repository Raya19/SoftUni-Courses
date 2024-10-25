package ForLoopLab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int value = 0;

        for (int i = 0; i < text.length() ; i++) {

            char letter = text.charAt(i);

            switch (letter) {

                case 'a':
                    value = value + 1;
                    break;
                case 'e':
                    value = value + 2;
                    break;
                case 'i':
                    value = value + 3;
                    break;
                case 'o':
                    value = value + 4;
                    break;
                case 'u':
                    value = value + 5;
                    break;

            }
        }
            System.out.println(value);
            
        }




        }


