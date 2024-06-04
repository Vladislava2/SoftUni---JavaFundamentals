package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) numberOfPeople / capacity);
        //Първо делим хората на капацитета.
        //След това кастваме към double.
        //Закръгляме до най-близкото по-голямо число и кастваме към int.
        System.out.println(courses);

    }
}
