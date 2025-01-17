package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> listWithSums = new ArrayList<>();
        for (int i = 0; i < numbers.size()/2; i++){
            int sum = numbers.get(i) + numbers.get(numbers.size()-1 -i);
            listWithSums.add(sum);
        }
        if (numbers.size() % 2 != 0){
            listWithSums.add(numbers.get(numbers.size()/2));
        }
        for (int number: listWithSums) {
            System.out.print(number + " ");
        }
    }
}
