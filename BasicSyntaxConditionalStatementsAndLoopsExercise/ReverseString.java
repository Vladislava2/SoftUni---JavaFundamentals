package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reverseInput = "";

        for(int position = input.length() - 1; position >= 0; position--){
            reverseInput = reverseInput + input.charAt(position);
        }
        System.out.println(reverseInput);
    }
}
