package FundamentalsFinalExam;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder usernameInput = new StringBuilder(username);

        String command = scanner.nextLine();
        while (!command.equals("Registration")){
            usernameInput = new StringBuilder(username);
            String commandName = command.split(" ")[0];
            switch (commandName){
                case ("Letters"):
                    String lowerOrUpper = command.split(" ")[1];
                    if (lowerOrUpper.equals("Lower")){
                        String newLowerInput = usernameInput.toString().toLowerCase();
                        System.out.println(newLowerInput);
                    } else if (lowerOrUpper.equals("Upper")){
                        String newUpperInput = usernameInput.toString().toUpperCase();
                        System.out.println(newUpperInput);
                    }
                    break;
                case ("Reverse"):
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int endIndex = Integer.parseInt(command.split(" ")[2]);
                    if (startIndex >= 0 && startIndex <= usernameInput.length() && endIndex >= 0 && endIndex <= usernameInput.length()){
                        String newString = usernameInput.substring(startIndex, endIndex + 1);
                        StringBuilder reversedString = new StringBuilder(newString);
                        System.out.println(reversedString.reverse());
                    }
                    break;
                case ("Substring"):
                    String substring = command.split(" ")[1];
                    int start = usernameInput.indexOf(substring);
                    int end = substring.length();
                    if (usernameInput.toString().contains(substring)) {
                        String first = usernameInput.substring(0, start);
                        String second = usernameInput.substring(end + 1, usernameInput.length());
                        String cutUsername = first + second;
                        usernameInput = new StringBuilder(cutUsername);
                        System.out.println(usernameInput);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", usernameInput, substring);
                    }
                    break;
                case ("Replace"):
                    String character = command.split(" ")[1];
                    String newUsername = usernameInput.toString();
                    String replacedUsername = newUsername.replaceAll(character, "-");
                    System.out.println(replacedUsername);
                    break;
                case ("IsValid"):
                    String secondCharacter = command.split(" ")[1];
                    String secondUsername = usernameInput.toString();
                    if (secondUsername.contains(secondCharacter)){
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", secondCharacter);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
