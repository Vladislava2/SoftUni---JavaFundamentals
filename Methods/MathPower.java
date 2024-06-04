package Methods;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        double poweredNumber = printPoweredNumber(number,power);
        System.out.println(Math.round(poweredNumber));

    }
    public static double printPoweredNumber (double number, double power){
        double poweredNumber = Math.pow(number, power);
        return poweredNumber;

    }
}
