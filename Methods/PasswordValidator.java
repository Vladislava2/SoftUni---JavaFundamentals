package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isLengthValid = isLengthValid(input);
        if (!isLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isContentValid = isContentValid(input);
        if (!isContentValid){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isAtLeastTwoDigits = isAtLeastTwoDigits(input);
        if (!isAtLeastTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }
        if (isLengthValid && isContentValid && isAtLeastTwoDigits){
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthValid (String input){
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean isContentValid (String input){
        for (char symbol : input.toCharArray()){
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean isAtLeastTwoDigits (String input){
        int digitCounter = 0;
        for (char symbol : input.toCharArray()){
            if(Character.isDigit(symbol)){
                digitCounter++;
                if (digitCounter >= 2){
                    return true;
                }
            }
        }
        return false;
    }
}
