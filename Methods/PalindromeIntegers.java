package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            boolean result = isPalindromeOrNot(input);
            if (result){
                System.out.println("true");
            } else if (!result){
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
    public static boolean isPalindromeOrNot(String input){
        String palindromeNumber = new StringBuffer(input).reverse().toString();
        if (!input.equals(palindromeNumber)){
            return false;
        } else {
            return true;
        }
    }
}
