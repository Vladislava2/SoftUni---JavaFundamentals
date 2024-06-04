package FundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String, Integer> foodInfo = new LinkedHashMap<>();
        int soldCount = 0;
        String command = scanner.nextLine();
        while (!command.equals("Complete")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case ("Receive"):
                    int quantity = Integer.parseInt(command.split(" ")[1]);
                    String food = command.split(" ")[2];
                    foodInfo.put(food, quantity);
                    if (quantity > 0){
                        if (foodInfo.containsKey(food)){
                            foodInfo.put(food, foodInfo.get(food) + quantity);
                        } else {
                            foodInfo.put(food, quantity);
                        }
                    }
                    break;
                case ("Sell"):
                    int quantityForSale = Integer.parseInt(command.split(" ")[1]);
                    String foodForSale = command.split(" ")[2];
                    if (!foodInfo.containsKey(foodForSale)){
                        System.out.printf("You do not have any %s.%n", foodForSale);
                    } else if (foodInfo.get(foodForSale) < quantityForSale) {
                        System.out.println("There aren't enough " + foodForSale + ". You sold the last " + foodInfo.get(foodForSale) + " of them.");
                        soldCount += foodInfo.get(foodForSale);
                        foodInfo.remove(foodForSale);
                    } else {
                        foodInfo.put(foodForSale, foodInfo.get(foodForSale) - quantityForSale);
                        System.out.println("You sold " + quantityForSale + " " + foodForSale + ".");
                        soldCount += quantityForSale;
                        if (foodInfo.get(foodForSale) == 0) {
                            foodInfo.remove(foodForSale);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : foodInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print count of all sold food
        System.out.println("All sold: " + soldCount + " goods");
    }
}
