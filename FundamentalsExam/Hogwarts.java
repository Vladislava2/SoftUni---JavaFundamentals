package FundamentalsExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newInput = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Abracadabra")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case ("Abjuration"):
                    String upperInput = newInput.toString().toUpperCase();
                    System.out.println(upperInput);
                    break;
                case ("Necromancy"):
                    String lowerInput = newInput.toString().toLowerCase();
                    System.out.println(lowerInput);
                    break;
                case ("Illusion"):
                    int index = Integer.parseInt(command.split(" ")[1]);
                    String letter = command.split(" ")[2];
                    if (index >= 0 && index <= newInput.length()-1){
                        newInput.insert(index, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case ("Divination"):
                    String firstSubstring = command.split(" ")[1];
                    String secondSubstring = command.split(" ")[2];
                    if (newInput.toString().contains(firstSubstring)){
                        String replacement = newInput.toString().replaceAll(firstSubstring, secondSubstring);
                        StringBuilder replacementBuilder = new StringBuilder(replacement);
                        newInput = replacementBuilder;
                        System.out.println(newInput);
                    } else {
                        continue;
                    }
                    break;
                case ("Alteration"):
                    String substring = command.split(" ")[1];
                    if (newInput.toString().contains(substring)) {
                        StringBuilder newSubstringReplace = new StringBuilder();
                        input = input.replace(substring, "");
                        newSubstringReplace.append(input);
                        newInput = newSubstringReplace;
                        System.out.println(newInput);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            command = scanner.nextLine();
        }
    }
}


