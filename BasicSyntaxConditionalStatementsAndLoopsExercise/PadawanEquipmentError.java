package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipmentError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
        int beltsCounter = 0;
        double totalSumOfBelts = 0;
        int timesCount = 0;

        for (int i = 1; i <= countOfStudents; i++){
            beltsCounter++;
            if (beltsCounter % 6 == 0){
                timesCount++;
                totalSumOfBelts = (priceOfBelts * (countOfStudents - timesCount));
            } else {
                totalSumOfBelts = (priceOfBelts * countOfStudents);
            }
        }

        double sum = (priceOfLightsabers * (Math.ceil(countOfStudents * 1.1))) + (priceOfRobes * countOfStudents) + totalSumOfBelts;

        if (amountOfMoney <= sum){
            System.out.printf("George Lucas will need %.2flv more.", sum - amountOfMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }
    }
}
