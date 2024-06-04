package EveryFirstTaskFromMidTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String commandName = command.split(" ")[0];

            switch (commandName){
                case "swap":
                    int firstIndex = Integer.parseInt(command.split(" ")[1]);
                    int secondIndex = Integer.parseInt(command.split(" ")[2]);
                    int firstElement = numbers.get(firstIndex);
                    int secondElement = numbers.get(secondIndex);
                    firstElement = numbers.set(secondIndex, Integer.valueOf(firstElement));
                    secondElement = numbers.set(firstIndex, Integer.valueOf(secondElement));
                    break;
                case "multiply":
                    int index1 = Integer.parseInt(command.split(" ")[1]);
                    int index2 = Integer.parseInt(command.split(" ")[2]);
                    int element1 = numbers.get(index1);
                    int element2 = numbers.get(index2);
                    int result = element1 * element2;
                    numbers.set(index1, Integer.valueOf(result));
                    break;
                case "decrease":
                    numbers = numbers
                            .stream()
                            .map(e -> e - 1)
                            .collect(Collectors.toList());
                    break;
            }
            command = scanner.nextLine();
        }
        List<String> numbersAsString = new ArrayList<>();
        for (int number : numbers) {
            numbersAsString.add(String.valueOf(number));
        }

        System.out.println(String.join(", ", numbersAsString));
    }
}
