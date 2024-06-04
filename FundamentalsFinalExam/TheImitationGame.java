package FundamentalsFinalExam;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newInput = new StringBuilder(input);

        while (!input.equals("Decode")){
            String command = scanner.nextLine();
            String commandName = command.split("\\|")[0];
            switch (commandName){
                case ("ChangeAll"):
                    char substring = command.split("\\|")[1].charAt(0);
                    String replacement = command.split("\\|")[2];
                    for (int i = 0; i < newInput.length(); i++){
                        if (newInput.charAt(i) == substring){
                            newInput.replace(i, i+1, replacement);
                        }
                    }
                    break;
                case ("Insert"):
                    int index = Integer.parseInt(command.split("\\|")[1]);
                    String value = command.split("\\|")[2];
                    newInput.insert(index,value);
                    break;
                case ("Move"):
                    int n = Integer.parseInt(command.split("\\|")[1]);
                    for (int i = 1; i <= n ; i++){
                        //докато цикълът се върти, на всяка итерация,
                        //се взима буква от началото на текста,
                        //изтрива се и същата тази буква се мести отзад
                        //но винаги е първата, тоест позиция 0,
                        //ЗАЩОТО НИЗЪТ СЕ ПРЕНАРЕЖДА
                        char getLetter = newInput.charAt(0);
                        newInput.deleteCharAt(0);
                        newInput.append(getLetter);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(newInput);
    }
}
//грешна