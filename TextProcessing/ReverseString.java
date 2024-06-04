package TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String reverseWord = "";
            for (int position = input.length()-1; position >= 0; position--){
                char symbol = input.charAt(position);
                reverseWord = reverseWord + symbol;
            }
            System.out.println(input + " = " + reverseWord);
            input = scanner.nextLine();
        }
    }
}
