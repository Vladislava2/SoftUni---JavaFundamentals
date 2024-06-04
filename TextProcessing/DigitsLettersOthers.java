package TextProcessing;

import java.util.Scanner;

public class DigitsLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (Character symbol : input.toCharArray()){
            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if (Character.isLetter(symbol)){
                letters.append(symbol);
            } else {
                others.append(symbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}
