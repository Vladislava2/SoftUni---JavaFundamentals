package FundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){
            String input = scanner.nextLine();
            String regex = "@#+(?<group>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String group = matcher.group("group");
                StringBuilder barcodeGroup = new StringBuilder();
                for (char symbol : group.toCharArray()){
                    if (symbol == '0' || symbol == '1' ||
                            symbol == '2' || symbol == '3' ||
                            symbol == '4' || symbol == '5' ||
                            symbol == '6' || symbol == '7' ||
                            symbol == '8' || symbol == '9'){
                        barcodeGroup.append(symbol);
                    }
                }
                if (barcodeGroup.length() == 0){
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", barcodeGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
