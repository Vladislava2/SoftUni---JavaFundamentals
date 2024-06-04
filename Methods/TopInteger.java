package Methods;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++){
            boolean isValidSumOfDigits = isSumOfDigitsIsDivisibleByEight(i);
            boolean doesItContainsOneOddDigit = doesNumberContainsOneOddDigit(i);
            if (isValidSumOfDigits && doesItContainsOneOddDigit){
                System.out.println(i);
            }
        }
    }
    public static boolean isSumOfDigitsIsDivisibleByEight (int number){
        int lastDigit = 0;
        int sum = 0;
        while (number>0){
            lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum % 8 == 0;
    }
    public static boolean doesNumberContainsOneOddDigit(int number){
        int lastDigit = 0;
        while (number > 0){
            lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
