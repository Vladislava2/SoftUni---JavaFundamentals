package DataTypesAndVariablesExercise;
import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = Integer.parseInt(scanner.nextLine());
        for (int start = 2; start <= end; start++) {
            boolean isPrime = true;
            for (int j = 2; j < start; j++) {
                if (start % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", start, isPrime);
        }


    }
}
