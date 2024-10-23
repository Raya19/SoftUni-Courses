package MapsExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> company = new LinkedHashMap<>();


        while (!command.equals("End")) {

            String[] commandParts = command.split(" -> ");
            String companyName = commandParts[0];
            String id = commandParts[1];


            boolean isRepeated = false;

            if (!company.containsKey(companyName)) {

                company.put(companyName, new ArrayList<>());
                company.get(companyName).add(id);

            } else {

                for (Map.Entry<String, List<String>> entry : company.entrySet()) {

                    if (entry.getKey().equals(companyName)) {

                        for (int i = 0; i < entry.getValue().size(); i++) {


                            if (id.equals(company.get(companyName).get(i))) {

                                isRepeated = true;
                                break;


                            } else {

                                isRepeated = false;


                            }

                        }

                    }


                }

                if (!isRepeated) {

                    company.get(companyName).add(id);
                }


            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : company.entrySet()) {

            System.out.printf("%s%n", entry.getKey());
            entry.getValue().forEach(employeeId -> System.out.println("-- " + employeeId));

        }
    }
}
