package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int strength = 0;

        for (int i = 0; i < textBuilder.length(); i++){
            char currentSymbol = textBuilder.charAt(i);
            if (currentSymbol == '>'){
                int explosion = Integer.parseInt(textBuilder.charAt(i+1) + "");
                strength += explosion;
            } else if (strength > 0){
                textBuilder.deleteCharAt(i);
                strength--;
                i--;
            }
        }

        System.out.println(textBuilder);
    }
}
