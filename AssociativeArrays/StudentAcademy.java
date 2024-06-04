package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            String studentName = scanner.nextLine();
            Double studentGrade = Double.parseDouble(scanner.nextLine());

            studentsGrades.putIfAbsent(studentName, new ArrayList<>());
            studentsGrades.get(studentName).add(studentGrade);
        }
        for(Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()){
            String studentName = entry.getKey();
            List<Double> studentsGrade = entry.getValue();

            double sum = 0;
            int count = 0;
            for (Double grade : studentsGrade){
                sum += grade;
                count++;
            }
            double average = sum / count;

            if (average >= 4.5){
                System.out.printf("%s -> %.2f%n", studentName, average);
            }
        }
    }
}
