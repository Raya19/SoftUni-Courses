package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());


        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= numberOfGroups ; i++) {

            int numberOfPeopleInGroup = Integer.parseInt(scanner.nextLine());


            if (numberOfPeopleInGroup <= 5) {
                musala = musala + numberOfPeopleInGroup;
            }
                else if (numberOfPeopleInGroup <= 12) {
                monblan = monblan + numberOfPeopleInGroup;
            }
                else if (numberOfPeopleInGroup <= 25) {
                kilimandjaro = kilimandjaro + numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 40) {
                k2 = k2 + numberOfPeopleInGroup;
            } else {
                    everest = everest + numberOfPeopleInGroup;

                }

                totalPeople = totalPeople + numberOfPeopleInGroup;
        }

        System.out.printf("%.2f%%%n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimandjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / totalPeople * 100);





            }

        }




