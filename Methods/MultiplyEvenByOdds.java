package Methods;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));
    }
    public static int getMultipleOfEvensAndOdds (int n){
        int evensSum = evensSum(n);
        int oddsSum = oddsSum(n);

        return evensSum * oddsSum;
    }

    public static int evensSum (int n){
        int evensSum = 0;
        if (n < 0){
            while (n < 0){
                int lastDigit = n % 10;
                if (lastDigit % 2 == 0){
                    evensSum += lastDigit;
                }
                n /= 10;
            }
        } else {
            while (n > 0){
                int lastDigit = n % 10;
                if (lastDigit % 2 == 0){
                    evensSum += lastDigit;
                }
                n /= 10;
            }
        }
        return evensSum;
    }

    public static int oddsSum (int n){
        int oddsSum = 0;
        if (n < 0){
            while (n < 0){
                int lastDigit = n % 10;
                if (lastDigit % 2 == -1){
                    oddsSum += lastDigit;
                }
                n /= 10;
            }
        } else {
            while (n > 0){
                int lastDigit = n % 10;
                if (lastDigit % 2 == 1){
                    oddsSum += lastDigit;
                }
                n /= 10;
            }
        }
        return oddsSum;
    }
}
