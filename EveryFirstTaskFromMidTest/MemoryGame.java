package EveryFirstTaskFromMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        int movesCounter = 0;

        while (!command.equals("end")){
            int firstIndex = Integer.parseInt(command.split(" ")[0]);
            int secondIndex = Integer.parseInt(command.split(" ")[1]);
            movesCounter++;
            command = scanner.nextLine();
            if (firstIndex == secondIndex || firstIndex > numbers.size()-1 || secondIndex > numbers.size()-1 || firstIndex < 0 || secondIndex < 0){
                int indexMiddle = (int) Math.floor(numbers.size()/2);
                String newItem = "-" + movesCounter + "a";
                numbers.add(indexMiddle, newItem);
                numbers.add(indexMiddle+1, newItem);
                System.out.println("Invalid input! Adding additional elements to the board");
                continue;
            }

            String firstElement = numbers.get(firstIndex);
            String secondElement = numbers.get(secondIndex);

            if (firstElement.equals(secondElement)){
                numbers.remove(firstElement);
                numbers.remove(secondElement);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
            } else {
                System.out.println("Try again!");
            }

            if (numbers.isEmpty()){
                System.out.printf("You have won in %d turns!%n", movesCounter);
                return;
            }
        }
        if (!numbers.isEmpty()){
            System.out.println("Sorry you lose :(");
            for (String number : numbers){
                System.out.print(number + " ");
            }
        }

    }
}
