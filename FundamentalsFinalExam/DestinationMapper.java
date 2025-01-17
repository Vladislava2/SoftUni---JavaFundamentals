package FundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        String text = scanner.nextLine();
        String regex = "([\\/=])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> validDestination = new ArrayList<>();

        while (matcher.find()){
            String destination = matcher.group("destination");
            validDestination.add(destination);
            points += destination.length();
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", validDestination));
        System.out.printf("Travel Points: %d", points);
    }
}
