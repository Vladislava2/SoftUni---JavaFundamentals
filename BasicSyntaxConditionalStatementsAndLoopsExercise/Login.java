package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int position = username.length()-1; position >= 0; position--){
            password = password + username.charAt(position);
        }

        int incorrectPasswordCounter = 0;
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            incorrectPasswordCounter++;
            if (incorrectPasswordCounter >= 4){
                System.out.printf("User %s blocked!", username);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
