package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case ("coffee"):
                printPrice(quantity, 1.5);
                break;
            case ("water"):
                printPrice(quantity, 1.00);
                break;
            case ("coke"):
                printPrice(quantity, 1.40);
                break;
            case ("snacks"):
                printPrice(quantity, 2.00);
                break;
        }
    }
    public static void printPrice (int quantity, double price){
        System.out.printf("%.2f",quantity * price);
    }
}
