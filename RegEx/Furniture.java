package RegEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> furnitureList = new ArrayList<>();

        double priceForFurniture;

        double totalSpent = 0;

        while (!text.equals("Purchase")){

            String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>(\\d+(?:\\.\\d+)?))!(?<quantity>[0-9]+)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furniture);
                priceForFurniture = price * quantity;
                totalSpent += priceForFurniture;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Bought furniture: %n");
        for (String furniture : furnitureList){
            System.out.println(furniture);
        }

        System.out.printf("Total money spend: %.2f", totalSpent);
    }
}
