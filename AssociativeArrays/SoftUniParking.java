package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++){
            String command = scanner.nextLine();
            String commandName = command.split(" ")[0];

            switch (commandName){
                case ("register"):
                    String username = command.split(" ")[1];
                    String licensePlateNumber = command.split(" ")[2];
                    if (cars.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        cars.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case ("unregister"):
                    String userName = command.split(" ")[1];
                    if (cars.containsKey(userName)){
                        cars.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : cars.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
