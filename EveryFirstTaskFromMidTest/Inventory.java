package EveryFirstTaskFromMidTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")){
            String commandName = command.split(" - ")[0];

            switch (commandName){
                case "Collect"://ok
                    String item = command.split(" - ")[1];
                    if (!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop"://ok
                    String itemForRemove = command.split(" - ")[1];
                    if (items.contains(itemForRemove)){
                        items.remove(itemForRemove);
                    }
                    break;
                case "Combine Items":
                    String parts = command.split(" - ")[1];
                    String oldItem = parts.split(":")[0];
                    String newItem = parts.split(":")[1];

                    if (items.contains(oldItem)){
                        int position = items.indexOf(oldItem);
                        items.add(position + 1, newItem);
                    }

                    break;
                case "Renew":
                    String itemForRenew = command.split(" - ")[1];
                    if (items.contains(itemForRenew)){
                        items.remove(itemForRenew);
                        items.add(itemForRenew);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
