package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case("int"):
                int number1 = Integer.parseInt(scanner.nextLine());
                int number2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(number1, number2));
                break;
            case ("char"):
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1, symbol2));
                break;
            case ("string"):
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }

    }
    public static int getMax (int number1, int number2){
        if (number2 > number1){
            return number2;
        } else {
            return number1;
        }
    }

    public static char getMax (char symbol1, char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        } else {
            return symbol2;
        }
    }

    public static String getMax (String text1, String text2){
        if (text1.compareTo(text2) >= 0){
            return text1;
        } else {
            return text2;
        }
    }
}
