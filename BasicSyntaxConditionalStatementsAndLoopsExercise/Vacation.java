package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double price = 0.0;

        switch (typeOfTheGroup){
            case ("Students"):
                switch (dayOfTheWeek){
                    case ("Friday"):
                        price = people * 8.45;
                        break;
                    case ("Saturday"):
                        price = people * 9.80;
                        break;
                    case ("Sunday"):
                        price = people * 10.46;
                        break;
                }
                if (people >= 30){
                    price = price - (price * 0.15);
                }
                break;
            case ("Business"):
                switch (dayOfTheWeek) {
                    case ("Friday"):
                        price = people * 10.90;
                        break;
                    case ("Saturday"):
                        price = people * 15.60;
                        break;
                    case ("Sunday"):
                        price = people * 16;
                        break;
                }
                if (people >= 100){
                    price = price * (people - 10);
                }
                break;
            case ("Regular"):
                switch (dayOfTheWeek) {
                    case ("Friday"):
                        price = people * 15;
                        break;
                    case ("Saturday"):
                        price = people * 20;
                        break;
                    case ("Sunday"):
                        price = people * 22.50;
                        break;
                }
                if (people >= 10 && people <= 20){
                    price = price - (price * 0.05);
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
