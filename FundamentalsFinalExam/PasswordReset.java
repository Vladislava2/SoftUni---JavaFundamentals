package FundamentalsFinalExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder password = new StringBuilder(input);
        StringBuilder rawPassword = new StringBuilder();
        String command = scanner.nextLine();
        while (!command.equals("Done")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case ("TakeOdd"):
                    for (int i = 0; i <= password.length()-1; i++){
                        if (i % 2 != 0){
                            char symbol = password.charAt(i);
                            rawPassword.append(symbol);
                        }
                    }
                    System.out.println(rawPassword);
                    break;
                case ("Cut"):
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int length = Integer.parseInt(command.split(" ")[2]);
                    rawPassword.replace(index, index + length, "");
                    System.out.println(rawPassword);
                    break;
                case ("Substitute"):
                    String substring = command.split(" ")[1];
                    String substitute = command.split(" ")[2];
                    if (rawPassword.toString().contains(substring)){
                        String newRawPassword = rawPassword.toString().replaceAll(substring, substitute);
                        StringBuilder newRawPass = new StringBuilder(newRawPassword);
                        rawPassword = newRawPass;
                        System.out.println(rawPassword);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", rawPassword);
    }
}
