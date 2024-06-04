package TextProcessing;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String message = "";

        for (char symbol : input.toCharArray()){
            int code = symbol + 3;
            char encryptedSymbol = (char) code;
            message += encryptedSymbol;
        }
        System.out.println(message);
    }
}
