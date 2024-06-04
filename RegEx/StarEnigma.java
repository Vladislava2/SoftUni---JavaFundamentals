package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int countAttackedPlanet = 0;
        int countDestroyedPlanet = 0;
        List <String> attackedPlanet = new ArrayList<>();
        List <String> destroyedPlanet = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            String input = scanner.nextLine();
            StringBuilder decryptedMessage = new StringBuilder();
            count = 0;
            for (char symbol : input.toCharArray()){
                if (symbol == 'S' || symbol == 'T'  || symbol == 'A' || symbol == 'R' || symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r'){
                    count++;
                }
            }
            for (char secondSymbol : input.toCharArray()) {
                secondSymbol -= count;
                decryptedMessage.append(secondSymbol);
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*:(?<population>[0-9]+)[^\\@\\-\\!\\:\\>]*!(?<attackType>[A-Z])!->[^\\@\\-\\!\\:\\>]*(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            while (matcher.find()){
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")){
                    countAttackedPlanet++;
                    attackedPlanet.add(planetName);
                } else if (attackType.equals("D")){
                    countDestroyedPlanet++;
                    destroyedPlanet.add(planetName);
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", countAttackedPlanet);
        Collections.sort(attackedPlanet);
        for (String planetName : attackedPlanet){
            System.out.printf("-> %s%n", planetName);
        }
        System.out.printf("Destroyed planets: %d%n", countDestroyedPlanet);
        Collections.sort(destroyedPlanet);
        for (String planetName : destroyedPlanet){
            System.out.printf("-> %s%n", planetName);
        }
    }
}
