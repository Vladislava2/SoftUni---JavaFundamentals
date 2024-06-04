package EveryFirstTaskFromMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String commandParts = command.split(" ")[0];
            switch (commandParts){
                case "Shoot":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    if (index >= 0 && index <= numbers.size()-1){
                        int power = Integer.parseInt(command.split(" ")[2]);
                        int number = numbers.get(index);
                        if (number <= power){
                            numbers.remove(Integer.valueOf(number));
                        } else {
                            numbers.set(index, number - power);
                        }
                    }
                break;
                case "Add":
                    int indexToAdd = Integer.parseInt(command.split(" ")[1]);
                    if (indexToAdd >= 0 && indexToAdd <= numbers.size()-1){
                        int value = Integer.parseInt(command.split(" ")[2]);
                        numbers.add(indexToAdd, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                    int value = Integer.parseInt(command.split(" ")[2]);
                    int radius = 1 + (value * 2);
                    int radiusStart = indexToRemove - value;
                    int radiusEnd = indexToRemove + value;
                    if (radiusStart >= 0 && radiusEnd < numbers.size()){
                        for (int i = radiusEnd; i >= radiusStart; i--){
                            numbers.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
            }
            command = scanner.nextLine();
        }
        System.out.print(numbers.toString().replace("[", "").replace("]", "").replaceAll(", ", "|"));
    }
}
