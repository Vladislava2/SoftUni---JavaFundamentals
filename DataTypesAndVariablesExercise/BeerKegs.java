package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume;
        double maxVolume = 0;
        String biggestKegModel = "";

        for (int i = 1; i <= n; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * radius * radius * height;
            if (volume > maxVolume){
                biggestKegModel = model;
                maxVolume = volume;
            }
        }
        System.out.println(biggestKegModel);
    }
}
