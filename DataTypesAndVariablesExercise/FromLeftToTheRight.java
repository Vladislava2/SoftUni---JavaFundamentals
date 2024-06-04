package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            double number1 = Double.parseDouble(scanner.next());
            double number2 = Double.parseDouble(scanner.next());

            int sum = 0;

            if (number1 > number2){
                double firstNum = Math.abs(number1);
                while (firstNum > 0){
                    sum += (firstNum % 10);
                    firstNum /= 10;
                }
            } else {
                double secondNum = Math.abs(number2);
                while (secondNum > 0){
                    sum += (secondNum % 10);
                    secondNum /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
