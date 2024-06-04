package EveryFirstTaskFromMidTest;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        int count = 0;
        double average = 0;
        int averageCounter = 0;
        int numberForAdd = 0;

        for (int i = 0; i <= numbers.size()-1; i++){
            int number = numbers.get(i);
            count++;
            sum += number;

        }
        average = sum * 1.0 / count;
        List<Integer> greaterThan = new ArrayList<>();

        for (int i = 0; i <= numbers.size()-1; i++){
            numberForAdd = numbers.get(i);
            if (numberForAdd > average){
                greaterThan.add(numberForAdd);
            }
        }

        if (numberForAdd > 0){
            if (numberForAdd <= average) {
                System.out.println("No");
            }
        }

        Collections.sort(greaterThan);
        Collections.reverse(greaterThan);
        for (Integer number : greaterThan){
            averageCounter++;
            if (averageCounter <= 5){
                System.out.print(number + " ");
            }
        }
    }
}
