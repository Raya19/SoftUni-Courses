import java.util.Scanner;;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (2 + nylon) * 1.50;
        double paintPrice = (paint + (0.10 * paint)) * 14.50;
        double thinnerPrice = thinner * 5.00;

     double costs = nylonPrice + paintPrice + thinnerPrice + 0.40;
     double oneHourWorkSum = (0.30 * costs) * hours;
     double sum = costs + oneHourWorkSum;

        System.out.println(sum);

      }
}
