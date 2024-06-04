package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String commandForList = command.split(" ")[0];

            switch (commandForList){
                case "Delete":
                    int element = Integer.parseInt(command.split(" ")[1]);
                    for (int i = 0; i <= numbers.size()-1; i++){
                        numbers.removeAll(List.of(element));
                    }
                    break;
                case "Insert":
                    int elementForInsert = Integer.parseInt(command.split(" ")[1]);
                    int index = Integer.parseInt(command.split(" ")[2]);
                    numbers.add(index,elementForInsert);
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }
}
