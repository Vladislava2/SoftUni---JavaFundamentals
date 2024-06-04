package EveryFirstTaskFromMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retire")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case ("Fire"):
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int damage = Integer.parseInt(command.split(" ")[2]);
                    if (index >= 0 && index <= warship.size()-1){
                        int element = warship.get(index);
                        if (element > damage) {
                            warship.set(index, element - damage);
                        } else {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case ("Defend"):
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int endIndex = Integer.parseInt(command.split(" ")[2]);
                    int secondDamage = Integer.parseInt(command.split(" ")[3]);
                    if (startIndex >= 0 && startIndex <= pirateShip.size()-1 && endIndex >= 0 && endIndex <= pirateShip.size()-1) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int element = pirateShip.get(i);
                            if (element > secondDamage) {
                                pirateShip.set(i, element - secondDamage);
                            } else {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case ("Repair"):
                    int secondIndex = Integer.parseInt(command.split(" ")[1]);
                    int health = Integer.parseInt(command.split(" ")[2]);
                    if (secondIndex >= 0 && secondIndex <= pirateShip.size()-1){
                        if (health <= maximumHealth){
                            int currentHealth = pirateShip.get(secondIndex);
                            pirateShip.set(secondIndex, currentHealth + health);
                        }
                    }
                    break;
                case ("Status"):
                    int count = 0;
                    for (int i = 0; i <= pirateShip.size()-1; i++){
                        int section = pirateShip.get(i);
                        double status = 0.2 * maximumHealth;
                        if (section < status){
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;

            }
            command = scanner.nextLine();
        }
        int sumPirateShip = 0;
        int sumWarship = 0;

        for (int element : pirateShip){
            sumPirateShip += element;
        }

        for (int element : warship){
            sumWarship += element;
        }
        if (!pirateShip.isEmpty() && !warship.isEmpty()){
            System.out.printf("Pirate ship status: %d%n" + "Warship status: %d%n", sumPirateShip, sumWarship);
        }
    }
}
