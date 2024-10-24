package OrderByAge;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<OrderByAge> persons = new ArrayList<>();

        while (!command.equals("End")) {

            String[] commandParts = command.split(" ");
            String name = commandParts[0];
            String ID = commandParts[1];
            int age = Integer.parseInt(commandParts[2]);



            OrderByAge currentPerson= new OrderByAge(name, ID, age);
            persons.add(currentPerson);


            command = scanner.nextLine();
        }

        Collections.sort(persons, Comparator.comparingInt(OrderByAge::getAge));

        for (OrderByAge person : persons) {

            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());

        }

    }
}
