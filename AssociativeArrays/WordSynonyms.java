package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            wordSynonyms.putIfAbsent(word, new ArrayList<>());
            wordSynonyms.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()){
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
