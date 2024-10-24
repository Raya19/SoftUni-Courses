import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualFee - 0.40 * annualFee;
        double equipment = shoesPrice - 0.20 * shoesPrice;
        double ball = equipment / 4;
        double assesories = ball / 5;

        double costs = shoesPrice + equipment + ball + assesories + annualFee;

        System.out.println(costs);



    }
}
