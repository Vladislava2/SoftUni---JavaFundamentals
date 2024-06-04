package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double totalSpent = 0.0;

        while(!input.equals("Game Time")){

            switch (input){
                case ("OutFall 4"):
                    if (balance < 39.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 39.99;
                        totalSpent = totalSpent + 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case ("CS: OG"):
                    if (balance < 15.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 15.99;
                        totalSpent = totalSpent + 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case ("Zplinter Zell"):
                    if (balance < 19.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 19.99;
                        totalSpent = totalSpent + 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case ("Honored 2"):
                    if (balance < 59.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 59.99;
                        totalSpent = totalSpent + 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case ("RoverWatch"):
                    if (balance < 29.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 29.99;
                        totalSpent = totalSpent + 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case ("RoverWatch Origins Edition"):
                    if (balance < 39.99){
                        System.out.println("Too Expensive");
                    } else {
                        balance = balance - 39.99;
                        totalSpent = totalSpent + 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            input = scanner.nextLine();
        }

        if (balance <= 0){
            System.out.println("Out of money!");
            return;
        }
        if (balance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalSpent, balance);
        }
    }
}
