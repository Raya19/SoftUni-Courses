package TextProcessingLab;

import java.util.Scanner;



public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {


            if (Character.isDigit(word.charAt(i))) {

                digits.append(word.charAt(i));


            }

            else if (Character.isLetter(word.charAt(i))) {

                letters.append(word.charAt(i));


            }
            else {

                others.append(word.charAt(i));
            }
            
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
