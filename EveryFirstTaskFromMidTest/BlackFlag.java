package EveryFirstTaskFromMidTest;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;

        for (int i = 1; i <= days; i++){
            totalPlunder += dailyPlunder;
            if (i % 3 == 0){
                totalPlunder += 0.5 * dailyPlunder;
            }

            if (i % 5 == 0){
                totalPlunder -= 0.3 * totalPlunder;
            }
        }
        if (totalPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", totalPlunder*100/expectedPlunder);
        }

    }
}
