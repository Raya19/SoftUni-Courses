import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int foodDogs = Integer.parseInt(scanner.nextLine());
        int foodCats = Integer.parseInt(scanner.nextLine());

        double onePackageDog = foodDogs * 2.50;
        int onePackageCats = foodCats * 4;

        double costs = onePackageCats + onePackageDog;

        System.out.printf("%.2f lv.", costs);


    }
}
