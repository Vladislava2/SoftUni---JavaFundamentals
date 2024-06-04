package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbersAndEvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine()
                               .split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                sumEven = sumEven + number;
            } else if (number % 2 == 1){
                sumOdd = sumOdd + number;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
