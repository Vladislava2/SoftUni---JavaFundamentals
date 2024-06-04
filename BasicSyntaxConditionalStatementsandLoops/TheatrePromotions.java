package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (typeOfDay.equals("Weekday")){
            if (age < 0 || age >= 123){
                System.out.println("Error!");
            } else if (age <= 18){
                System.out.println("12$");
            } else if (age <= 64){
                System.out.println("18$");
            } else {
                System.out.println("12$");
            }
        } else if (typeOfDay.equals("Weekend")){
            if (age < 0 || age >= 123){
                System.out.println("Error!");
            } else if (age <= 18){
                System.out.println("15$");
            } else if (age <= 64){
                System.out.println("20$");
            } else {
                System.out.println("15$");
            }
        } else if (typeOfDay.equals("Holiday")){
            if (age < 0 || age >= 123){
                System.out.println("Error!");
            } else if (age <= 18){
                System.out.println("5$");
            } else if (age <= 64){
                System.out.println("12$");
            } else {
                System.out.println("10$");
            }
        }
    }
}
