package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        List<String> guest = new ArrayList<>();

        for (int i = 0; i < numbers; i++){
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            if (command.contains("not")){
                if (guest.contains(name)){
                    guest.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else if (guest.contains(name)){
                System.out.printf("%s is already in the list!%n", name);
            } else {
                guest.add(name);
            }
        }

        for (String guestName : guest){
            System.out.println(guestName);
        }

    }
}
