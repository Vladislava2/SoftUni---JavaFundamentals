package TextProcessing;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        String name = "";
        String age = "";

        for (int i = 1; i <= numberOfInputs; i++){
            String input = scanner.nextLine();

            int positionOfClamp = input.indexOf('@')+1;
            int positionOfStraightLine = input.indexOf('|');
            name = input.substring(positionOfClamp, positionOfStraightLine);

            int positionOfSharp = input.indexOf('#')+1;
            int positionOfStar = input.indexOf('*');
            age = input.substring(positionOfSharp, positionOfStar);

            System.out.println(name + " is " + age + " years old.");
        }
    }
}
