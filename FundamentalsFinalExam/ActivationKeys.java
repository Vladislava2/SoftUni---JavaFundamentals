package FundamentalsFinalExam;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder rawActivationKey = new StringBuilder();
        rawActivationKey.append(input);

        String command = scanner.nextLine();
        while (!command.equals("Generate")){
            String commandName = command.split(">>>")[0];
            switch (commandName){
                case ("Contains"):
                    String substring = command.split(">>>")[1];
                    if (rawActivationKey.toString().contains(substring)){
                        System.out.printf("%s contains %s%n", rawActivationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case ("Flip"):
                    String LowerOrUpper = command.split(">>>")[1];
                    int startIndex = Integer.parseInt(command.split(">>>")[2]);
                    int endIndex = Integer.parseInt(command.split(">>>")[3]);
                    String secondSubstring = rawActivationKey.substring(startIndex, endIndex);
                    rawActivationKey.delete(startIndex, endIndex);
                    if (LowerOrUpper.equals("Lower")){
                        secondSubstring = secondSubstring.toLowerCase();
                        rawActivationKey.insert(startIndex, secondSubstring);
                        System.out.println(rawActivationKey);
                    } else {
                        secondSubstring = secondSubstring.toUpperCase();
                        rawActivationKey.insert(startIndex, secondSubstring);
                        System.out.println(rawActivationKey);
                    }
                    break;
                case ("Slice"):
                    int start = Integer.parseInt(command.split(">>>")[1]);
                    int end = Integer.parseInt(command.split(">>>")[2]);
                    rawActivationKey.delete(start, end);
                    System.out.println(rawActivationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawActivationKey);
    }
}
