package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long factorialNumber1 = getFactorial(number1);
        long factorialNumber2 = getFactorial(number2);

        double result = factorialNumber1 * 1.0 / factorialNumber2;

        System.out.printf("%.2f", result);
    }
    public static long getFactorial(int number){
        long fact = 1;
        for (int i = 1; i <= number; i++){
            fact *= i;
        }
        return fact;
    }
}
