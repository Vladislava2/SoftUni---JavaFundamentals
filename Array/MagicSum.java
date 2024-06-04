package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for(int position = 0; position < numbers.length -1; position++){
            int currentNumber = numbers[position];

            for (int newPosition = position + 1; newPosition <= numbers.length-1; newPosition++){
                int newNumber = numbers[newPosition];
                if (currentNumber + newNumber == n){
                    System.out.printf("%d %d%n", currentNumber, newNumber);
                }
            }
        }
    }
}
