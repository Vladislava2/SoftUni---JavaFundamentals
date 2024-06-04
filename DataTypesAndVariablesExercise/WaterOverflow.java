package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int quantity = 0;

        for (int i = 1; i <= n; i++){
            int waterLiters = Integer.parseInt(scanner.nextLine());
            quantity += waterLiters;
            if (quantity > 255){
                System.out.printf("Insufficient capacity!%n");
                quantity -= waterLiters;
            }
        }
        System.out.println(quantity);
    }
}
