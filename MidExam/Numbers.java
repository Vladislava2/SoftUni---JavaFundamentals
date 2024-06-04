package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Finish")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case "Add":
                    int value = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(value);
                    break;
                case "Remove":
                    int firstValue = Integer.parseInt(command.split(" ")[1]);
                    for (int i = 0; i <= numbers.size()-1; i++){
                            int number = numbers.get(i);
                            if (number == firstValue){
                                numbers.remove(i);
                                break;
                        }
                    }
                    break;
                case "Replace":
                    int secondValue = Integer.parseInt(command.split(" ")[1]);
                    int replacement = Integer.parseInt(command.split(" ")[2]);
                    for (int i = 0; i <= numbers.size()-1; i++){
                        int number = numbers.get(i);
                        if (number == secondValue){
                            numbers.set(i, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int thirdValue = Integer.parseInt(command.split(" ")[1]);
                    numbers.removeIf(num -> num < thirdValue);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
