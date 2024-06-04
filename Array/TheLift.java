package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int[] currentStateOfWagon = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isLiftFull = true;

        for (int position = 0; position < currentStateOfWagon.length; position++) {
            int availableSpace = 4 - currentStateOfWagon[position];

            if (availableSpace > 0) {
                if (availableSpace > numberOfPeople) {
                    currentStateOfWagon[position] += numberOfPeople;
                    numberOfPeople = 0;
                    isLiftFull = false;
                } else {
                    currentStateOfWagon[position] = 4;
                    numberOfPeople -= availableSpace;
                }
            }
        }
        if (!isLiftFull){
            System.out.println("The lift has empty spots!");
        } else if (numberOfPeople > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n",numberOfPeople);
        }

        for (int currentState : currentStateOfWagon) {
            System.out.print(currentState + " ");
        }
    }
}
