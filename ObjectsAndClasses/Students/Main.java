package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String infoForStudents = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!infoForStudents.equals("end")){
            String firstName = infoForStudents.split(" ")[0];
            String lastName = infoForStudents.split(" ")[1];
            int age = Integer.parseInt(infoForStudents.split(" ")[2]);
            String hometown = infoForStudents.split(" ")[3];

            if (isStudentExisting(students, firstName, lastName)) {
                int index = getExistingIndex(students, firstName, lastName);
                students.get(index).setAge(age);
                students.get(index).setHometown(hometown);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, hometown);
                students.add(currentStudent);
            }
            infoForStudents = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : students){
            if (student.getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
    public static int getExistingIndex (List<Student> students, String firstName, String lastName){
        int index = -1;
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                index = i;
            }
        }
        return index;
    }
    public static boolean isStudentExisting(List<Student> students, String firstName, String lastName){
        for (Student student : students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
