package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String numberToText = number + "";

        char c = numberToText.charAt(numberToText.length()-1);

        if (c == '1'){
            System.out.println("one");
        }
        if (c == '2'){
            System.out.println("two");
        }
        if (c == '3'){
            System.out.println("three");
        }
        if (c == '4'){
            System.out.println("four");
        }
        if (c == '5'){
            System.out.println("five");
        }
        if (c == '6'){
            System.out.println("six");
        }
        if (c == '7'){
            System.out.println("seven");
        }
        if (c == '8'){
            System.out.println("eight");
        }
        if (c == '9'){
            System.out.println("nine");
        }
        if (c == '0'){
            System.out.println("zero");
        }
    }
}
