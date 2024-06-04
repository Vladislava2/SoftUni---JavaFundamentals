package FundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productName = new ArrayList<>();
        List<String> expirationDate = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();

        int totalCalories = 0;
        int days = 0;
        String input = scanner.nextLine();

        String regex = "\\|?\\#?(?<productName>[A-Za-z\\s]+)\\|?\\#?(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\|?\\#?(?<calories>[0-9]{1,5})\\|?\\#";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String product = matcher.group("productName");
            String expirationData = matcher.group("expirationDate");
            int calories1 = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories1;

            productName.add(product);
            expirationDate.add(expirationData);
            calories.add(calories1);
        }
        days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        if (days > 0) {
            for (int i = 0; i <= productName.size() - 1; i++) {
                System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", productName.get(i), expirationDate.get(i), calories.get(i));
            }
        }
    }
}

///\|?\#?(?<productName>[A-Z ?a-z]+)\|?\#?(?<expirationDate>[0-9]{2}\/[0-9]{2}\/[0-9]{2})\|?\#?(?<calories>[0-9]+)\|?\#?
