package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalCoins = 0.0;
        double coin = 0.0;

        while(!input.equals("Start")){

            coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.50 || coin == 1 || coin == 2){
                totalCoins = totalCoins + coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while(!product.equals("End")){
            switch(product){
                case("Nuts"):
                    if (totalCoins < 2.0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoins = totalCoins - 2.0;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case("Water"):
                    if (totalCoins < 0.7){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoins = totalCoins - 0.7;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case("Crisps"):
                    if (totalCoins < 1.5){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoins = totalCoins - 1.5;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case("Soda"):
                    if (totalCoins < 0.8){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoins = totalCoins - 0.8;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case("Coke"):
                    if (totalCoins < 1.0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoins = totalCoins - 1.0;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", totalCoins);
    }
}
