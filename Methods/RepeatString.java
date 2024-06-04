package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        String newString = repeatString(text, repeat);
        System.out.println(newString);

    }
    public static String repeatString (String text, int repeat){
        String repeatedString = "";
        for (int i = 1; i <= repeat; i++){
            repeatedString += text;
        }
        return repeatedString;
    }
}
