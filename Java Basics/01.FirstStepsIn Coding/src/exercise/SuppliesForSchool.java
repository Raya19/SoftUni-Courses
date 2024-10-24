import java.util.Scanner;

public class SuppliesforSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int percentageDiscount = Integer.parseInt(scanner.nextLine());

        double packagePens = pens * 5.80;
        double packageMarkers = markers * 7.20;
        double oneLeterDetergent = detergent * 1.20;

        double sum = packageMarkers + packagePens + oneLeterDetergent;


        double sumWithDiscount = sum - (sum * percentageDiscount / 100);


        System.out.println(sumWithDiscount);


    }
}
