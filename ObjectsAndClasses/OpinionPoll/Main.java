package ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        List<Person> peopleOver30 = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            String personalInfo = scanner.nextLine();

            String name = personalInfo.split(" ")[0];
            int age = Integer.parseInt(personalInfo.split(" ")[1]);

            Person person = new Person(name, age);

            personList.add(person);

            if (age > 30){
                peopleOver30.add(person);
            }
        }

        for (Person person : peopleOver30){
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
