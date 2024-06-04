package TextProcessing;

import java.util.Scanner;


public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstInput = input.split(" ")[0];
        String secondInput = input.split(" ")[1];

        int sum = 0;

        if (firstInput.length() > secondInput.length()){
            for (int i = 0; i <= secondInput.length() - 1; i++){
                sum += (firstInput.charAt(i) * secondInput.charAt(i));
            }
            for (int i = secondInput.length();  i <= firstInput.length()-1; i++){
                int code = firstInput.charAt(i);
                sum += code;
            }
        } else if (firstInput.length() < secondInput.length()){
            for (int i = 0; i <= firstInput.length() - 1; i++){
                sum += (firstInput.charAt(i) * secondInput.charAt(i));
            }
            for (int i = firstInput.length();  i <= secondInput.length()-1; i++){
                int code = secondInput.charAt(i);
                sum += code;
            }
        } else {
            for (int i = 0; i <= firstInput.length() - 1; i++){
                sum += (firstInput.charAt(i) * secondInput.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
