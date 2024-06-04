package AssociativeArrays;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> points = new LinkedHashMap<>();
        Map<String, Integer> occurrences = new LinkedHashMap<>();
        int count = 0;

        while (!input.equals("exam finished")){
            String username = input.split("-")[0];
            String command = input.split("-")[1];
            if (!command.equals("banned")){
                if (occurrences.containsKey(command)){
                    count = occurrences.get(command);
                    occurrences.put(command, count + 1);
                } else {
                    occurrences.put(command, 1);
                }
            }
            if (command.equals("banned")){
                String currentUsername = username;
                points.remove(currentUsername);
            } else {
                int point = Integer.parseInt(input.split("-")[2]);
                points.putIfAbsent(username, point);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : points.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
