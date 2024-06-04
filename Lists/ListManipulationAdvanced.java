package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Contains":
                    int isContains = Integer.parseInt(commandParts[1]);
                    numbers.contains(isContains);
                    if (numbers.contains(isContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Filter":
                    String condition = commandParts[1];
                    int numberToFilter = Integer.parseInt(commandParts[2]);
                    switch (condition){
                        case "<":
                            for (int number : numbers){
                                if (number < numberToFilter){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int number : numbers){
                                if (number > numberToFilter){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int number : numbers){
                                if (number <= numberToFilter){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int number : numbers){
                                if (number >= numberToFilter){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int number : numbers){
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Print":
                    String secondCommand = commandParts[1];
                    switch (secondCommand){
                        case "even":
                            for (int number : numbers){
                                if (number % 2 == 0){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        break;
                        case "odd":
                            for (int number : numbers){
                                if (number % 2 != 0){
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
            command = scanner.nextLine();
        }
    }
}
