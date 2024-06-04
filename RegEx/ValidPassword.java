package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            String input = scanner.nextLine();
            String regex = "_\\.+(?<passText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String passwordText = matcher.group("passText");

                StringBuilder group = new StringBuilder();

                for (char symbol : passwordText.toCharArray()) {
                    if (symbol == '0' || symbol == '1' ||
                            symbol == '2' || symbol == '3' ||
                            symbol == '4' || symbol == '5' ||
                            symbol == '6' || symbol == '7' ||
                            symbol == '8' || symbol == '9') {
                        group.append(symbol);
                    }
                }
                if (group.length() == 0){
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + group);
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
