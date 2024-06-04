package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> lightSide = new LinkedHashMap<>();
        Map<String, String> lightSideNames = new LinkedHashMap<>();
        Map<String, Integer> darkSide = new LinkedHashMap<>();
        Map<String, String> darkSideNames = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")){
            if (input.contains("|")){
                String forceSide = input.split(" //| ")[0];
                String forceUser = input.split("//|")[1];


            }
            input = scanner.nextLine();
        }
    }
}
