package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {

            case "int":

                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                System.out.println(greaterOfTwoValues(firstNum, secondNum));
                break;

            case "char":

                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);

                System.out.println(greaterOfTwoValues(firstSymbol, secondSymbol));
                break;

            case "string":

                String firstName = scanner.nextLine();
                String secondName = scanner.nextLine();

                System.out.println(greaterOfTwoValues(firstName, secondName));
                break;
        }
    }

    public static int greaterOfTwoValues(int firstNum, int secondNum) {


        if (firstNum > secondNum) {

            return firstNum;


        } else {

            return secondNum;
        }
    }

    public static char greaterOfTwoValues(char firstSymbol, char secondSymbol) {


        if (firstSymbol > secondSymbol) {

            return firstSymbol;


        } else {

            return secondSymbol;
        }
    }

    public static String greaterOfTwoValues(String firstName, String secondName) {

        if (firstName.compareTo(secondName) > 0) {

            return firstName;

        } else {

            return secondName;
        }


    }
}