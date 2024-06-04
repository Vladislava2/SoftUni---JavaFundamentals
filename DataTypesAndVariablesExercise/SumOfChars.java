package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int code;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            char latinAlphabet = scanner.nextLine().charAt(0);

            code = (int) latinAlphabet;
            sum = sum + code;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
