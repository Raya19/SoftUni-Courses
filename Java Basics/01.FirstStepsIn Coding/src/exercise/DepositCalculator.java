import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());


        double accruedInterest = deposit * annualInterestRate / 100;
        double interestPerMonth = accruedInterest / 12;


        double sum = deposit + months * interestPerMonth;

        System.out.println(sum);

    }

}