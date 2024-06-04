package EveryFirstTaskFromMidTest;

import java.util.Scanner;

public class EveryFirstTaskFromMidTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double parts;
        double taxes = 0;
        double sumWithoutTaxes = 0.0;
        double sumWithTaxes = 0.0;

        while (!input.equals("special") && !input.equals("regular")){
            parts = Double.parseDouble(input);
            if (parts < 0){
                System.out.println("Invalid price!");
            } else {
                sumWithoutTaxes = sumWithoutTaxes + parts;
                taxes = 0.2 * sumWithoutTaxes;
                sumWithTaxes = sumWithoutTaxes + taxes;
            }
            input = scanner.nextLine();
        }
        if (input.equals("special")){
            sumWithTaxes = sumWithTaxes - (0.1 * sumWithTaxes);
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sumWithoutTaxes, taxes, sumWithTaxes);
        } else {
            if (sumWithTaxes == 0){
                System.out.println("Invalid order!");
            } else {
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sumWithoutTaxes, taxes, sumWithTaxes);
            }
        }
    }
}
