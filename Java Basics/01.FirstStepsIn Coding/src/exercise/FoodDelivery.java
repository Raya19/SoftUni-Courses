import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


      int chicken = Integer.parseInt(scanner.nextLine());
      int fish = Integer.parseInt(scanner.nextLine());
      int vegetarian = Integer.parseInt(scanner.nextLine());

      double chickenPrice = chicken * 10.35;
      double fishPrice = fish * 12.40;
      double vegetarianPrice = vegetarian * 8.15;

      double costs = chickenPrice + fishPrice + vegetarianPrice;
      double dessert = 0.20 * costs;

      double sum = costs + dessert + 2.50;

        System.out.println(sum);






    }
}
