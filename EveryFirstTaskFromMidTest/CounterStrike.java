package EveryFirstTaskFromMidTest;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int distance;
        int wonBattles = 0;

        while(!input.equals("End of battle")){
            distance = Integer.parseInt(input);
            initialEnergy = initialEnergy - distance;
            wonBattles++;
            if (initialEnergy < 0){
                wonBattles = wonBattles - 1;
                initialEnergy = initialEnergy + distance;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                return;
            }
            if (wonBattles % 3 == 0){
                initialEnergy = initialEnergy + wonBattles;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
    }
}
