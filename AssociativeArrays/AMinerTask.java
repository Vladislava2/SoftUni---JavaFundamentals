package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)){
                int currentQuantity = resources.get(input);
                resources.put(input, quantity + currentQuantity);
            } else {
                resources.put(input, quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
