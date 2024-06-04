package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> employees = new LinkedHashMap<>();

        while (!input.equals("End")){
            String name = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            List<String> currentCompanyEmployees = employees.get(name);
            boolean containsID = currentCompanyEmployees != null && currentCompanyEmployees.contains(id);

            if (!containsID){
                employees.putIfAbsent(name, new ArrayList<>());
                employees.get(name).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : employees.entrySet()){
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().forEach(id -> System.out.printf("-- %s%n", id));
        }
    }
}
