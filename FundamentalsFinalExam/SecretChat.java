package FundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder();
        message.append(concealedMessage);
        String command = scanner.nextLine();
        while (!command.equals("Reveal")){
            String commandName = command.split(":\\|:")[0];
            switch (commandName){
                case ("InsertSpace"):
                    int index = Integer.parseInt(command.split(":\\|:")[1]);
                    String space = " ";
                    message.insert(index, space);
                    System.out.println(message);
                    break;
                case ("Reverse"):
                    String substring = command.split(":\\|:")[1];
                    if (message.toString().contains(substring)){
                        int start = message.indexOf(substring);
                        int end = message.charAt(substring.length());
                        message.delete(start, end);
                        StringBuilder reversedString = new StringBuilder();
                        reversedString.append(substring);
                        reversedString.reverse();
                        message.append(reversedString);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case ("ChangeAll"):
                    String secondSubstring = command.split(":\\|:")[1];
                    String replacement = command.split(":\\|:")[2];
                    String updatedMessage = Pattern.compile(secondSubstring).matcher(message).replaceAll(replacement);
                    message.replace(0, message.length(), updatedMessage);
                    System.out.println(message);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
