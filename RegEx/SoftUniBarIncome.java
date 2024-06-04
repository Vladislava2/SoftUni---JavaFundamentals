package RegEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<String, String> nameAndProductName = new LinkedHashMap<>();
        Map<String, Double> nameAndPrice = new LinkedHashMap<>();


        double totalPrice = 0;
        double priceForProducts;
        while (!text.equals("end of shift")){
            String regex = "%(?<name>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<quantity>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                String name = matcher.group("name");
                String productName = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                priceForProducts = price * quantity;
                totalPrice += priceForProducts;

                nameAndProductName.put(name, productName);
                nameAndPrice.put(name, priceForProducts);
            }
            text = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : nameAndPrice.entrySet()){
            String name = entry.getKey();
            String productName = nameAndProductName.get(name);
            double price = entry.getValue();

            System.out.printf("%s: %s - %.2f%n", name, productName, price);
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
