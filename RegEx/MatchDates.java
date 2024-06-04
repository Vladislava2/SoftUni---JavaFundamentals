package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String dates = scanner.nextLine();

            String regex = "\\b(?<day>[0-9]{2})([\\.\\/\\-])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(dates);

            while (matcher.find()){
                String date = matcher.group("day");
                String month = matcher.group("month");
                String year = matcher.group("year");

                System.out.printf("Day: %s, Month: %s, Year: %s%n", date, month, year);
            }

    }
}
