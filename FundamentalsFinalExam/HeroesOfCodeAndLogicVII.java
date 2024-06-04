package FundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, Integer> heroNameAndHP = new LinkedHashMap<>();
        Map <String, Integer> heroNameAndMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){
            String input = scanner.nextLine();

            String heroNames = input.split(" ")[0];
            int HP = Integer.parseInt(input.split(" ")[1]);
            int MP = Integer.parseInt(input.split(" ")[2]);

            if (HP <= 100){
                heroNameAndHP.put(heroNames, HP);
            }

            if (MP <= 200){
                heroNameAndMP.put(heroNames, MP);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String commandName = command.split(" - ")[0];
            String heroName = command.split(" - ")[1];
            switch (commandName){
                case ("CastSpell"):
                    int MPNeeded = Integer.parseInt(command.split(" - ")[2]);
                    String spellName = command.split(" - ")[3];
                    if (MPNeeded <= heroNameAndMP.get(heroName)){
                        heroNameAndMP.put(heroName, heroNameAndMP.get(heroName) - MPNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroNameAndMP.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case ("TakeDamage"):
                    int damage = Integer.parseInt(command.split(" - ")[2]);
                    String attacker = command.split(" - ")[3];
                    int currentHP = heroNameAndHP.get(heroName);
                    currentHP -= damage;

                    if (currentHP > 0){
                        heroNameAndHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    } else {
                        heroNameAndMP.remove(heroName);
                        heroNameAndHP.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case ("Recharge"):
                    int amount = Integer.parseInt(command.split(" - ")[2]);
                    int currentAmountOfMP = heroNameAndMP.get(heroName);
                    if (amount + heroNameAndMP.get(heroName) > 200){
                        heroNameAndMP.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentAmountOfMP);
                    } else {
                        heroNameAndHP.put(heroName, currentAmountOfMP - amount);
                        System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    }
                    break;
                case ("Heal"):
                    int secondAmount = Integer.parseInt(command.split(" - ")[2]);
                    int currentAmountOfHP = heroNameAndHP.get(heroName);
                    if (secondAmount + heroNameAndHP.get(heroName) > 100){
                        heroNameAndHP.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - currentAmountOfHP);
                    } else {
                        heroNameAndHP.put(heroName, currentAmountOfHP - secondAmount);
                        System.out.printf("%s healed for %d HP!%n", heroName, secondAmount);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry <String, Integer> entry : heroNameAndMP.entrySet()){
            String heroName = entry.getKey();
            int MP = entry.getValue();
            int HP = heroNameAndHP.get(heroName);

            System.out.printf("%s%n", heroName);
            System.out.printf("  HP: %d%n", HP);
            System.out.printf("  MP: %d%n", MP);
        }
    }
}
