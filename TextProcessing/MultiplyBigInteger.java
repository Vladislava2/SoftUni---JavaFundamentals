package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        BigInteger firstNumber = new BigInteger(firstInput);
        BigInteger secondNumber = new BigInteger(secondInput);

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
