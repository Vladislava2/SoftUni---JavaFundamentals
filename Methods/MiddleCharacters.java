package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printTheMiddleCharacter(input);
    }
    public static void printTheMiddleCharacter (String input){
        if(input.length() % 2 == 1){
            int indexOfMiddleChar = input.length()/2;
            System.out.println(input.charAt(indexOfMiddleChar));
        } else {
            int indexOfFirstMiddleChar = input.length()/2 - 1;
            int indexOfSecondMiddleChar = input.length()/2;
            System.out.print(input.charAt(indexOfFirstMiddleChar));
            System.out.println(input.charAt(indexOfSecondMiddleChar));
        }
    }
}
