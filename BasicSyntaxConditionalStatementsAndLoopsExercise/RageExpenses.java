package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        double expenses = 0.0;

        for (int game = 1; game <= lostGames; game++){
            if (game % 2 == 0){
                headsetCount++;
            }
            if (game % 3 == 0){
                mouseCount++;
            }
            if (game % 6 == 0){
                keyboardCount++;
            }
            if (game % 12 == 0){
                displayCount++;
            }
        }
        expenses = (headsetPrice * headsetCount) + (mousePrice * mouseCount) + (keyboardPrice * keyboardCount) + (displayPrice * displayCount);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
