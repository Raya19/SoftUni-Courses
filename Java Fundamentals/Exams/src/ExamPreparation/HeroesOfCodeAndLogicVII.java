package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroHP = new LinkedHashMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] infoHero = scanner.nextLine().split(" ");

            String nameHero = infoHero[0];
            int hp = Integer.parseInt(infoHero[1]);
            int mp = Integer.parseInt(infoHero[2]);


            if (hp <= 100) {

                heroHP.put(nameHero, hp);
            }

            if (mp <= 200) {

                heroMP.put(nameHero, mp);
            }


        }


        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandParts = command.split(" - ");

            String commandType = commandParts[0];

            switch (commandType) {

                case "CastSpell":

                    String heroName = commandParts[1];
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];

                    if (heroMP.get(heroName) >= mpNeeded) {

                        int leftMP = heroMP.get(heroName) - mpNeeded;


                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMP);

                        heroMP.put(heroName, leftMP);
                    }

                    else {

                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

              case "TakeDamage":

                    String name = commandParts[1];
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    int leftHP = heroHP.get(name) - damage;
                    heroHP.put(name, leftHP);

                    if (heroHP.get(name) > 0) {

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, leftHP);
                    }

                    else {

                        heroHP.remove(name);
                        heroMP.remove(name);

                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                    }


                  break;

                case "Recharge":

                    String name2 = commandParts[1];
                    int amount = Integer.parseInt(commandParts[2]);

                    int increasedMP = heroMP.get(name2) + amount;

                    if (increasedMP > 200) {

                        increasedMP = 200;

                    }


                    System.out.printf("%s recharged for %d MP!%n", name2, increasedMP - heroMP.get(name2));

                    heroMP.put(name2, increasedMP);

                    break;

                case "Heal":

                    String name3 = commandParts[1];
                    int amount2 = Integer.parseInt(commandParts[2]);

                    int increasedHP = heroHP.get(name3) + amount2;

                    if (increasedHP > 100) {

                        increasedHP = 100;

                    }


                    System.out.printf("%s healed for %d HP!%n", name3, increasedHP - heroHP.get(name3));

                    heroHP.put(name3, increasedHP);

                    break;
            }



            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : heroHP.entrySet()) {

            for (Map.Entry<String, Integer> entry2 : heroMP.entrySet()) {

                System.out.printf("%s%n", entry.getKey());
                System.out.printf("  HP: %d%n", entry.getValue());
                System.out.printf("  MP: %d%n", entry2.getValue());


                heroMP.remove(entry2.getKey());
                break;

            }

        }
    }
}
