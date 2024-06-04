package MidExam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBiscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int countOfTheWorkers = Integer.parseInt(scanner.nextLine());
        int numberOfBiscuitsCompetingFactory = Integer.parseInt(scanner.nextLine());
        int totalProduction = 0;

        for (int i = 1; i <= 30; i++){
            double biscuitsPerDay = numberOfBiscuitsPerDay * countOfTheWorkers;
            if (i % 3 == 0){
                biscuitsPerDay = (int) Math.floor(0.75 * biscuitsPerDay);
            }
            totalProduction += biscuitsPerDay;
        }
        double percent = ((double) Math.abs(totalProduction - numberOfBiscuitsCompetingFactory) / numberOfBiscuitsCompetingFactory)*100;
        System.out.printf("You have produced %d biscuits for the past month.%n", totalProduction);
        if (totalProduction > numberOfBiscuitsCompetingFactory) {
            System.out.printf("You produce %.2f percent more biscuits.%n", percent);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.%n", percent);
        }
    }
}
