package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (char character : input.toCharArray()){

            if (character == ' '){
                continue;
            }

            if (occurrences.containsKey(character)){
                int count = occurrences.get(character);
                occurrences.put(character, count + 1);
            } else {
                occurrences.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
