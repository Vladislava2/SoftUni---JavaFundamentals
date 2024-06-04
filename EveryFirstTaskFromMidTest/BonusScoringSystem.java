package EveryFirstTaskFromMidTest;

import java.util.*;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfTheLecture = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        List<Integer> attendancePerStudent = new ArrayList<>();
        List<Double> bonuses = new ArrayList<>();

        for (int i = 1; i <= numberOfStudents; i++){
            int attendance = Integer.parseInt(scanner.nextLine());
            attendancePerStudent.add(attendance);

            double totalBonus = attendance * 1.0 / numberOfTheLecture * (5 + additionalBonus);
            bonuses.add(totalBonus);
        }
        double largestBonus = Collections.max(bonuses);
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(largestBonus));
        int largestAttendance = Collections.max(attendancePerStudent);
        System.out.printf("The student has attended %d lectures.%n", largestAttendance);
    }
}
