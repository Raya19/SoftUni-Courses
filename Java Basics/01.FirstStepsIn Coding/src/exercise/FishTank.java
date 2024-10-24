import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeInLeters = volume / 1000;
        double neededLeters = volumeInLeters * (1 - percentage * 0.01);

        System.out.println(neededLeters);






    }
}
