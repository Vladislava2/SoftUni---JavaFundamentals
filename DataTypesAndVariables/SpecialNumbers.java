package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int digitSum = 0;
            while (currentNum > 0) {
                digitSum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            if (digitSum == 5 || digitSum == 7 || digitSum == 11){
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
