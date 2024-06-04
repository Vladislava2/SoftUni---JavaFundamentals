package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = getSum(number1, number2);
        int subtract = getSubtract(sum, number3);

        System.out.println(subtract);
    }
    public static int getSum (int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
    public static int getSubtract (int number1, int number2){
        int subtract = number1 - number2;
        return subtract;
    }
}
