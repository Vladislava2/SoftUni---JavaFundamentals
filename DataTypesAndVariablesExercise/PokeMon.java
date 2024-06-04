package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        int startPower = pokePower;

        while (pokePower >= distance){
            pokePower -= distance;
            pokeCounter++;
            if (pokePower == startPower / 2){
                if (exhaustionFactor != 0){
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
