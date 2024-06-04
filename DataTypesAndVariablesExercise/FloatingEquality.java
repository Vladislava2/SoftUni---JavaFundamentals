package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());

        double result = Math.abs(number1 - number2);

        if (result >= 0.000001){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
