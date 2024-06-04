package FundamentalsFinalExam;
import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newInput = new StringBuilder();
        newInput.append(input);
        String command = scanner.nextLine();
        while (!command.equals("Travel")){
            String commandName = command.split(":")[0];
            switch (commandName){
                case ("Add Stop"):
                    int index = Integer.parseInt(command.split(":")[1]);
                    String stop = command.split(":")[2];
                    if (index >= 0 && index <= newInput.length()-1){
                        newInput.insert(index, stop);
                        System.out.println(newInput);
                    }
                    break;
                case ("Remove Stop"):
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);
                    if (startIndex >= 0 && startIndex <= newInput.length()-1 && endIndex >= 0 && endIndex <= newInput.length()-1) {
                        newInput.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(newInput);
                    break;
                case ("Switch"):
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    int firstIndex = newInput.indexOf(oldString);
                    if (newInput.toString().contains(oldString)){
                        newInput.replace(firstIndex, firstIndex+oldString.length(), newString);
                    }
                    System.out.println(newInput);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", newInput);
    }
}
