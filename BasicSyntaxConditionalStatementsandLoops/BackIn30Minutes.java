package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutes + 30;

        int hoursAfter30minutes = time / 60;
        int minutesAfter30minutes = time % 60;

        if (hoursAfter30minutes > 23){
            hoursAfter30minutes = 0;
        }

        if (minutesAfter30minutes < 10){
            System.out.printf("%d:0%d", hoursAfter30minutes, minutesAfter30minutes);
        } else {
            System.out.printf("%d:%d", hoursAfter30minutes, minutesAfter30minutes);
        }
    }
}
