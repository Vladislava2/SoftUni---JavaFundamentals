package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int code = 0;
        char newChar;

        for (int i = 1; i <= n; i++){
            char c = scanner.nextLine().charAt(0);

            code = (int) c;
            code = code + key;
            newChar = (char) code;


            System.out.print(newChar);
        }
    }
}
