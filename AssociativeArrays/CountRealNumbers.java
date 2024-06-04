package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Map <Integer, Integer> counts = new HashMap<>();

        for (int num : numbers){
            if (!counts.containsKey(num)){
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()){
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
