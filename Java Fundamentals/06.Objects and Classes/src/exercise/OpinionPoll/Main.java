package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll> list = new ArrayList<>();



        for (int i = 0; i < n; i++) {

            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            OpinionPoll opinionPoll = new OpinionPoll(name, age);
            list.add(opinionPoll);


        }

        for (OpinionPoll opinionPoll : list) {

            if (opinionPoll.getAge() > 30) {

                System.out.printf("%s - %d%n", opinionPoll.getName(), opinionPoll.getAge());


            }
            
        }
    }
}
