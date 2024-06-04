package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String commandName = command.split(" - ")[0];
            switch (commandName){
                case "Add":
                    String phone = command.split(" - ")[1];
                    if (!phones.contains(phone)){
                        phones.add(phone);
                    }
                    break;
                case "Remove":
                    String secondPhone = command.split(" - ")[1];
                    if (phones.contains(secondPhone)){
                        phones.remove(secondPhone);
                    }
                    break;
                case "Bonus phone":
                    String newString = command.split(" - ")[1];
                    String oldPhone = newString.split(":")[0];
                    String newPhone = newString.split(":")[1];
                    if (phones.contains(oldPhone)){
                        int oldPhoneIndex = phones.indexOf(oldPhone);
                        phones.add(oldPhoneIndex+1, newPhone);
                    }
                    break;
                case "Last":
                    String fourthPhone = command.split(" - ")[1];
                    if (phones.contains(fourthPhone)){
                        phones.remove(fourthPhone);
                        phones.add(fourthPhone);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", phones));
    }
}
