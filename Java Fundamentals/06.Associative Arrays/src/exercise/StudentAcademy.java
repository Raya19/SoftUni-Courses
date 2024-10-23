package MapsExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> print = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());


            if (!students.containsKey(name)) {

                students.put(name, new ArrayList<>());
            }

            students.get(name).add(grade);


        }


        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {

            double sum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {

                sum += entry.getValue().get(i);


            }

            double averageGrade = sum / 2;


            if (averageGrade >= 4.50) {

                print.put(entry.getKey(), averageGrade);

            } else if (entry.getValue().size() == 1) {

                if (sum >= 4.50) {

                    print.put(entry.getKey(), sum);
                }

            }

        }
        for (Map.Entry<String, Double> entry : print.entrySet()) {


            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());

        }
    }

}
