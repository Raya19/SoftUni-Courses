import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double price = squareMeters * 7.61;
        double priceWithDiscount = 0.18 * price;
        double totalPrice = price - priceWithDiscount;

        System.out.printf("The final price is %.2f lv.%n", totalPrice);
        System.out.printf("The discount is %.2f lv.", priceWithDiscount);




    }
}
