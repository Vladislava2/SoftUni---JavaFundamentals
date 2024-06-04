package ObjectsAndClasses.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String information = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!information.equals("End")){
            String name = information.split(" ")[0];
            String id = information.split(" ")[1];
            int age = Integer.parseInt(information.split(" ")[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            information = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person :: getAge));

        for (Person person : people){
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }
    }
}
