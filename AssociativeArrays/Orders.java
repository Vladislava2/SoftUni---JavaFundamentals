package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Integer> quantities = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            Double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (quantities.containsKey(name)){
                int currentQuantity = quantities.get(name);
                quantities.put(name, quantity + currentQuantity);
            } else {
                quantities.put(name, quantity);
            }

            prices.put(name, price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : quantities.entrySet()){
            String productName = entry.getKey();
            int productQuantity = entry.getValue();
            double productPrice = prices.get(productName);

            System.out.printf("%s -> %.2f%n", productName, productPrice * productQuantity);
        }
    }
}
