package TextProcessing;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split(" ");

        for (String text : texts){
            int length = text.length();
            for (int i = 1; i <= length; i++){
                System.out.print(text);
            }
        }


    }
}
