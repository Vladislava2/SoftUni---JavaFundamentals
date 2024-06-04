package ObjectsAndClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i < n; i++){
            String information = scanner.nextLine();

            String name = information.split(" ")[0];
            double salary = Double.parseDouble(information.split(" ")[1]);
            String position = information.split(" ")[2];
            String department = information.split(" ")[3];
            String email = "n/a";
            int age = -1;

            if (information.length() == 5) {
                if (information.contains("@")) {
                    email = information.split(" ")[4];
                } else {
                    age = Integer.parseInt(information.split(" ")[4]);
                }
            } else if (information.length() == 6){
                email = information.split(" ")[4];
                age = Integer.parseInt(information.split(" ")[5]);
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            employees.add(employee);
        }


        for (Employee employee : employees){
            System.out.println();
        }
    }
}
