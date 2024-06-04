package FundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\1\1(?<secondWord>[A-Za-z]{3,})\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            StringBuilder originalWord = new StringBuilder();
            StringBuilder reversedWord = new StringBuilder();
            StringBuilder reversedOriginalWord = new StringBuilder();
            originalWord.append(matcher.group("firstWord"));
            reversedWord.append(matcher.group("secondWord"));
            reversedOriginalWord.append(originalWord);
            reversedOriginalWord.reverse();
            if (reversedOriginalWord.equals(reversedWord)){
                count++;
            } else {
                System.out.println();
            }

        }
    }
}
