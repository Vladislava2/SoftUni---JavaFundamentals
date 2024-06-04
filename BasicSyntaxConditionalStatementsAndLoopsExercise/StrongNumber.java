package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int sumOfFactorials = 0;
        for (int position = 0; position <= number.length()-1; position++){
            int digit = Integer.parseInt(number.charAt(position)+"");

            int factorial = 1;
            for (int i = 2; i <= digit; i++){
                factorial = factorial * i;
            }

            sumOfFactorials = sumOfFactorials + factorial;
        }


        if ((sumOfFactorials + "").equals(number)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
