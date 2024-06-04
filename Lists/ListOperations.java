package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            String commandName = command.split(" ")[0];

            switch (commandName){
                case "Add":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                    int index = Integer.parseInt(command.split(" ")[2]);
                    if (index >= 0 && index <= numbers.size()-1) {
                        numbers.add(index, numberToAdd);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                    if (indexToRemove >= 0 && indexToRemove <= numbers.size()-1) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String commandParts = command.split(" ")[1];
                    if (commandParts.equals("left")){
                        int shiftLeftCount = Integer.parseInt(command.split(" ")[2]);
                        for (int i = 0; i < shiftLeftCount; i++){
                            int firstElement = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else if (commandParts.equals("right")){
                        int shiftRightCount = Integer.parseInt(command.split(" ")[2]);
                        for (int i = 0; i < shiftRightCount; i++){
                            int lastNumber = numbers.get(numbers.size()-1);
                            numbers.remove(numbers.size()-1);
                            numbers.add(0, lastNumber);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
