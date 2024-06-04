package Methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();
        switch (command){
            case ("int"):
                int intNumber = Integer.parseInt(input);
                multiplyByTwo(intNumber);
                break;
            case ("real"):
                double doubleNumber = Double.parseDouble(input);
                multiplyDouble(doubleNumber);
                break;
            case ("string"):
                formattedString(input);
                break;
        }

    }

    public static void multiplyByTwo (int number){
        number = number * 2;
        System.out.println(number);
    }

    public static void multiplyDouble (double number){
        number = number * 1.5;
        System.out.printf("%.2f", number);
    }

    public static void formattedString (String text){
        System.out.printf("$%s$", text);
    }
}

